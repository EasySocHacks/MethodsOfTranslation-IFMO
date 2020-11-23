import syntax.ExpressionParser;
import visualizer.GraphVisualizer;

public class Main {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new ExpressionParser();
        ExpressionParser.Node node = expressionParser.parse("(a and b) or not (c xor (a or not b))");

        System.out.println(node);

        GraphVisualizer graphVisualizer = new GraphVisualizer(node);
        graphVisualizer.visualize();
    }
}
