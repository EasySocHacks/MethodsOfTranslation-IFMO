package syntax;

import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import grammar.Grammar;
import grammar.GrammarParser;
import grammar.objects.GrammarObject;
import grammar.objects.nonterminals.NonTerminal;
import grammar.objects.terminals.Terminal;
import grammar.rules.Rule;
import lexic.LexicalAnalyzer;

import java.util.ArrayList;
import java.util.List;

public class ExpressionParser {
    private final Grammar grammar;
    private final SyntaxAnalyzer syntaxAnalyzer;
    private LexicalAnalyzer lexicalAnalyzer;

    public static class Node {
        private final GrammarObject grammarObject;
        private final List<Node> children;

        public Node(GrammarObject grammarObject) {
            this.grammarObject = grammarObject;

            children = new ArrayList<>();
        }

        public GrammarObject getGrammarObject() {
            return grammarObject;
        }

        public List<Node> getChildren() {
            return children;
        }

        @SuppressWarnings("rawtypes")
        @Override
        public String toString() {
            if (grammarObject instanceof Terminal) {
                if (grammarObject.equals(Terminal.EPSILON)) {
                    return "";
                }

                if (((Terminal) grammarObject).getExtraValue() != null) {
                    return ((Terminal) grammarObject).getExtraValue().toString();
                }

                return grammarObject.toString();
            }

            StringBuilder stringBuilder = new StringBuilder();

            boolean isFirstChild = true;

            for (Node child : children) {
                String childString = child.toString();

                if (!childString.equals("")) {
                    if (!isFirstChild) {
                        stringBuilder.append(" ");
                    }

                    isFirstChild = false;

                    stringBuilder.append(childString);
                }
            }

            return stringBuilder.toString();
        }
    }

    public ExpressionParser() {
        GrammarParser grammarParser = new GrammarParser();

        this.grammar = grammarParser.getGrammar();
        this.syntaxAnalyzer = new SyntaxAnalyzer(grammar);
    }

    public Node parse(String expression) throws TokenizerParseException, ExpressionParserException {
        lexicalAnalyzer = new LexicalAnalyzer(expression, grammar.getTerminals());

        lexicalAnalyzer.nextToken();

        if (lexicalAnalyzer.getToken() == Terminal.EOS) {
            throw new ExpressionParserException("Cannot parse an empty string");
        }

        return parseNonTerminal(grammar.getStartNonTerminal());
    }

    @SuppressWarnings("rawtypes")
    private List<Terminal> getRulePossibleTerminals(Rule rule) {
        List<Terminal> firstList = syntaxAnalyzer.getFirst(rule.getToGrammarObjectsList());

        if (firstList.contains(Terminal.EPSILON)) {
            firstList.remove(Terminal.EPSILON);

            List<Terminal> fallowList = syntaxAnalyzer.getFollow(rule.getFromNonTerminal());

            for (Terminal terminal : fallowList) {
                if (!firstList.contains(terminal)) {
                    firstList.add(terminal);
                }
            }
        }

        return firstList;
    }

    private Node parseNonTerminal(NonTerminal nonTerminal) throws TokenizerParseException, ExpressionParserException {
        Node node = new Node(nonTerminal);

        for (Rule rule : grammar.getRuleList()) {
            if (!rule.getFromNonTerminal().equals(nonTerminal)) {
                continue;
            }

            if (!getRulePossibleTerminals(rule).contains(lexicalAnalyzer.getToken())) {
                continue;
            }

            for (GrammarObject grammarObject : rule.getToGrammarObjectsList()) {
                if (grammarObject instanceof Terminal) {
                    if (grammarObject.equals(Terminal.EPSILON)) {
                        node.getChildren().add(new Node(Terminal.EPSILON));

                        break;
                    }

                    if (!lexicalAnalyzer.getToken().equals(grammarObject)) {
                        throw new ExpressionParserException(
                                String.format("Cannot resolve token '%s' in rule '%s'", lexicalAnalyzer.getToken(), rule));
                    }

                    node.getChildren().add(new Node(lexicalAnalyzer.getToken()));
                    lexicalAnalyzer.nextToken();

                    continue;
                }

                node.getChildren().add(parseNonTerminal((NonTerminal) grammarObject));
            }

            break;
        }

        if (node.getChildren().isEmpty()) {
            throw  new ExpressionParserException(
                    String.format("Cannot find rule for token '%s' and non-terminal '%s'", lexicalAnalyzer.getToken(), nonTerminal));
        }

        return node;
    }
}
