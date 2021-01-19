import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import grammar.Grammar;
import syntax.ExpressionParser;
import visualizer.GraphVisualizer;

public class PythonLogicExpressionMain {
    public static void main(String args[]) {
        Grammar grammar = GrammarBuilder.buildGrammar("pythonLogicExpressionGrammar");

        ExpressionParser expressionParser = new ExpressionParser(grammar);
        ExpressionParser.Node node = null;

        try {
            node = expressionParser.parse("(a and b) or not (c xor (a or not b))");
        } catch (TokenizerParseException | ExpressionParserException e) {
            e.printStackTrace();
        }

        System.out.println(node);

        GraphVisualizer graphVisualizer = new GraphVisualizer(node);
        graphVisualizer.visualize();
    }
}
