package grammar;

import exceptions.grammar.GrammarRuleParseException;
import grammar.objects.GrammarObject;
import grammar.objects.nonterminals.NonTerminal;
import grammar.objects.terminals.Terminal;
import grammar.rules.Rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("rawtypes")
public class Grammar {
    private final String RULE_USAGE_STRING = "Usage: [Non-terminal] -> " +
            "[Terminal|Non-terminal|{ Translator code }] <[Terminal|Non-terminal|{ Translator code }][ ]>*";
    private final String[] terminalDeniedSubstrings = {"'", "$"};
    private final String[] nonTerminalDeniedSubstrings = {"'", "$"};

    private List<Terminal> terminals;

    private List<NonTerminal> nonTerminals;

    private NonTerminal startNonTerminal = new NonTerminal("S");

    private List<Rule> ruleList = new ArrayList<>();

    public Grammar() {}

    public Grammar(List<Terminal> terminals, List<NonTerminal> nonTerminals, NonTerminal startNonTerminal, List<Rule> ruleList) {
        this.terminals = terminals;
        this.nonTerminals = nonTerminals;
        this.startNonTerminal = startNonTerminal;
        this.ruleList = ruleList;
    }

    public void buildGrammar() throws GrammarRuleParseException {
        checkTerminals();
        checkNonTerminals();
        checkStartNonTerminal();
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
                                    ? Collections.singletonList((GrammarObject) Terminal.EPSILON)
                                    : ruleJ.getToGrammarObjectsList().subList(1, ruleJ.getToGrammarObjectsList().size()))
                    ));
                }
            }

            if (foundRightBranching) {
                nonTerminals.add(possibleNewNonTerminal);

                ruleList.set(i, new Rule(
                        possibleNewNonTerminal,
                        (ruleI.getToGrammarObjectsList().size() == 1
                                ? Collections.singletonList((GrammarObject) Terminal.EPSILON)
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
                        }

                        ruleList.get(j).getToGrammarObjectsList().add(newNonTerminal);
                    }
                }

                ruleList.add(new Rule(
                        newNonTerminal,
                        Collections.singletonList((GrammarObject) Terminal.EPSILON)
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
