package grammar;

import com.fasterxml.jackson.annotation.JsonProperty;
import exceptions.grammar.GrammarRuleParseException;
import grammar.objects.GrammarObject;
import grammar.objects.nonterminals.NonTerminal;
import grammar.objects.terminals.Terminal;
import grammar.rules.Rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Grammar {
    private final String RULE_USAGE_STRING = "Usage: [Non-terminal] -> [Terminal|Non-terminal] <[Terminal|Non-terminal][ ]>*";
    private final String[] terminalDeniedSubstrings = {"'", "$"};
    private final String[] nonTerminalDeniedSubstrings = {"'", "$"};

    @JsonProperty("terminals")
    private List<Terminal> terminals;

    @JsonProperty("non-terminals")
    private List<NonTerminal> nonTerminals;

    @JsonProperty("start-non-terminal")
    private NonTerminal startNonTerminal = new NonTerminal("S");

    @JsonProperty("rules")
    private List<String> ruleStringList;
    private final List<Rule> ruleList = new ArrayList<>();

    public Grammar() {}

    public Grammar(List<Terminal> terminals, List<NonTerminal> nonTerminals, NonTerminal startNonTerminal, List<String> ruleStringList)
            throws GrammarRuleParseException {
        this.terminals = terminals;
        this.nonTerminals = nonTerminals;
        this.startNonTerminal = startNonTerminal;
        this.ruleStringList = ruleStringList;
    }

    public void buildGrammar() throws GrammarRuleParseException {
        checkTerminals();
        checkNonTerminals();
        checkStartNonTerminal();
        parseRules();
        deleteRecursion();
    }

    private void deleteRecursion() {
        if (deleteDirectlyLeftRecursion()) {
            deleteRecursion();
        } else if (deleteRightBranching()) {
            deleteRecursion();
        }
    }

    private boolean deleteRightBranching() {
        for (int i = 0; i < ruleList.size(); i++) {
            Rule ruleI = ruleList.get(i);
            NonTerminal possibleNewNonTerminal = new NonTerminal(ruleI.getFromNonTerminal().getName() + "'r");

            boolean foundRightBranching = false;
            for (int j = i + 1; j < ruleList.size(); j++) {
                Rule ruleJ = ruleList.get(j);

                if (ruleI.getFromNonTerminal().equals(ruleJ.getFromNonTerminal()) &&
                ruleI.getToGrammarObjectsList().get(0).equals(ruleJ.getToGrammarObjectsList().get(0))) {
                    foundRightBranching = true;

                    ruleList.set(j, new Rule(
                            possibleNewNonTerminal,
                            (ruleJ.getToGrammarObjectsList().size() == 1
                                    ? Collections.singletonList(Terminal.EPSILON)
                                    : ruleJ.getToGrammarObjectsList().subList(1, ruleJ.getToGrammarObjectsList().size()))
                    ));
                }
            }

            if (foundRightBranching) {
                nonTerminals.add(possibleNewNonTerminal);

                ruleList.set(i, new Rule(
                        possibleNewNonTerminal,
                        (ruleI.getToGrammarObjectsList().size() == 1
                                ? Collections.singletonList(Terminal.EPSILON)
                                : ruleI.getToGrammarObjectsList().subList(1, ruleI.getToGrammarObjectsList().size()))
                ));

                ruleList.add(new Rule(
                        ruleI.getFromNonTerminal(),
                        Arrays.asList(ruleI.getToGrammarObjectsList().get(0), possibleNewNonTerminal)
                ));

                return true;
            }
        }

        return false;
    }

    private boolean deleteDirectlyLeftRecursion() {
        for (int i = 0; i < ruleList.size(); i++) {
            if (ruleList.get(i).getFromNonTerminal().equals(ruleList.get(i).getToGrammarObjectsList().get(0))) {
                NonTerminal recursiveNonTerminal = ruleList.get(i).getFromNonTerminal();
                NonTerminal newNonTerminal = new NonTerminal(recursiveNonTerminal.getName() + "'l");

                boolean foundDirectlyLeftRecursion = false;

                for (Rule ruleJ : ruleList) {
                    if (ruleJ.getFromNonTerminal().equals(recursiveNonTerminal) &&
                            !ruleJ.getToGrammarObjectsList().get(0).equals(recursiveNonTerminal)) {
                        foundDirectlyLeftRecursion = true;

                        break;
                    }
                }

                if (!foundDirectlyLeftRecursion) {
                    continue;
                }

                nonTerminals.add(newNonTerminal);

                for (int j = 0; j < ruleList.size(); j++) {
                    Rule ruleJ = ruleList.get(j);

                    if (ruleJ.getFromNonTerminal().equals(recursiveNonTerminal)) {
                        if (ruleJ.getToGrammarObjectsList().get(0).equals(recursiveNonTerminal)) {
                            ruleList.set(j, new Rule(
                                    newNonTerminal,
                                    ruleJ.getToGrammarObjectsList().subList(1, ruleJ.getToGrammarObjectsList().size())
                            ));
                            ruleList.get(j).getToGrammarObjectsList().add(newNonTerminal);
                        } else {
                            ruleList.get(j).getToGrammarObjectsList().add(newNonTerminal);
                        }
                    }
                }

                ruleList.add(new Rule(
                        newNonTerminal,
                        Collections.singletonList(Terminal.EPSILON)
                ));

                return true;
            }
        }

        return false;
    }

    private void checkTerminals() throws GrammarRuleParseException {
        for (Terminal terminal : terminals) {
            if (terminal.equals(Terminal.EPSILON)) {
                throw new GrammarRuleParseException(String.format("Terminal '%s' is already reserved",  Terminal.EPSILON.getName()));
            }

            if (terminal.equals(Terminal.EOS)) {
                throw new GrammarRuleParseException(String.format("Terminal '%s' is already reserved", Terminal.EOS.getName()));
            }

            for (String terminalDeniedSubstring : terminalDeniedSubstrings) {
                if (terminal.getName().contains(terminalDeniedSubstring)) {
                    throw new GrammarRuleParseException(String.format("Substring '%s' is denied in terminals", terminalDeniedSubstring));
                }
            }
        }
    }

    private void checkNonTerminals() throws GrammarRuleParseException {
        for (NonTerminal nonTerminal : nonTerminals) {
            for (String nonTerminalDeniedSubstring : nonTerminalDeniedSubstrings) {
                if (nonTerminal.getName().contains(nonTerminalDeniedSubstring)) {
                    throw new GrammarRuleParseException(String.format("Substring '%s' is denied in non-terminals", nonTerminalDeniedSubstring));
                }
            }
        }
    }

    private void checkStartNonTerminal() throws GrammarRuleParseException {
        if (!nonTerminals.contains(startNonTerminal)) {
            throw new GrammarRuleParseException(String.format("Unable to resolve start-non-terminal %s'", startNonTerminal.getName()));
        }
    }

    private void parseRules() throws GrammarRuleParseException {
        for (String ruleString : ruleStringList) {
            ruleList.add(parseRule(ruleString));
        }
    }

    private Rule parseRule(String ruleString) throws GrammarRuleParseException {
        List<String> ruleTokens = Arrays.asList(ruleString.split(" "));

        if (ruleTokens.size() < 3) {
            throw new GrammarRuleParseException("Syntax error while parsing grammar rules" +
                    System.lineSeparator() + RULE_USAGE_STRING);
        }

        NonTerminal fromNonTerminal = new NonTerminal(ruleTokens.get(0));
        if (!nonTerminals.contains(fromNonTerminal)) {
            throw new GrammarRuleParseException(String.format("Unknown non-terminal '%s'", fromNonTerminal.getName()));
        }

        if (!ruleTokens.get(1).equals("->")) {
            throw new GrammarRuleParseException("Syntax error while parsing grammar rules" +
                    System.lineSeparator() + RULE_USAGE_STRING);
        }

        List<GrammarObject> toGrammarObjectsList = new ArrayList<>();

        for (int i = 2; i < ruleTokens.size(); i++) {
            Terminal toTerminal = new Terminal(ruleTokens.get(i));
            NonTerminal toNonTerminal = new NonTerminal(ruleTokens.get(i));

            if (terminals.contains(toTerminal)) {
                toGrammarObjectsList.add(toTerminal);
                continue;
            }

            if (nonTerminals.contains(toNonTerminal)) {
                toGrammarObjectsList.add(toNonTerminal);
                continue;
            }

            throw new GrammarRuleParseException(String.format("Unable to resolve grammar object '%s'", ruleTokens.get(i)));
        }

        return new Rule(fromNonTerminal, toGrammarObjectsList);
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public List<NonTerminal> getNonTerminals() {
        return nonTerminals;
    }

    public NonTerminal getStartNonTerminal() {
        return startNonTerminal;
    }

    public List<Rule> getRuleList() {
        return ruleList;
    }
}
