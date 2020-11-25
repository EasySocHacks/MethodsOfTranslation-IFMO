import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import syntax.ExpressionParser;
import visualizer.GraphVisualizer;

public class Main {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new ExpressionParser();
        ExpressionParser.Node node = null;
        try {
            node = expressionParser.parse("((A or B) xor (C and Z)) or D");
        } catch (TokenizerParseException | ExpressionParserException e) {
            e.printStackTrace();
        }

        System.out.println(node);

        GraphVisualizer graphVisualizer = new GraphVisualizer(node);
        graphVisualizer.visualize();
    }
}
