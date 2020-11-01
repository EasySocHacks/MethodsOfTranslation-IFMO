package grammar;

import com.fasterxml.jackson.annotation.JsonProperty;
import exceptions.grammar.GrammarRuleParseException;
import grammar.objects.GrammarObject;
import grammar.objects.nonterminals.NonTerminal;
import grammar.objects.terminals.Terminal;
import grammar.rules.Rule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grammar {
    private final String RULE_USAGE_STRING = "Usage: [Non-terminal] -> [Terminal|Non-terminal] <[Terminal|Non-terminal][ ]>*";
    private final String[] terminalDeniedSubstrings = {"'"};
    private final String[] nonTerminalDeniedSubstrings = {"'"};

    @JsonProperty("terminals")
    private List<Terminal> terminals;

    @JsonProperty("non-terminals")
    private List<NonTerminal> nonTerminals;

    @JsonProperty("start-non-terminal")
    private NonTerminal startNonTerminal = new NonTerminal("S");

    @JsonProperty("rules")
    private List<String> ruleStringList;
    private List<Rule> ruleList = new ArrayList<>();

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
    }

    private void checkTerminals() throws GrammarRuleParseException {
        for (Terminal terminal : terminals) {
            if (terminal.equals(Terminal.EPSILON)) {
                throw new GrammarRuleParseException("Terminal 'eps' is already reserved");
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
}
