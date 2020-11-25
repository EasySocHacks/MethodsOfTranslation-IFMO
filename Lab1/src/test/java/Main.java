import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import syntax.ExpressionParser;
import visualizer.GraphVisualizer;

public class Main {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new ExpressionParser();
        ExpressionParser.Node node = null;
        try {
            node = expressionParser.parse("(A and b) or not (C xor (a or not B))");
        } catch (TokenizerParseException | ExpressionParserException e) {
            e.printStackTrace();
        }

        System.out.println(node);

        GraphVisualizer graphVisualizer = new GraphVisualizer(node);
        graphVisualizer.visualize();
    }
}
