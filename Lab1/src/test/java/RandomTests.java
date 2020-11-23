import exceptions.lexic.tokenizer.TokenizerParseException;
import exceptions.syntax.ExpressionParserException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandomTests extends BaseTests {
    private int minDepth;
    private final Random random = new Random();

    private enum UnaryOperators {
        NOT("not");

        private String name;

        UnaryOperators(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private enum BinaryOperators {
        XOR("xor"),
        OR("or"),
        AND("and");

        private String name;

        BinaryOperators(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private int generateNumberUpTo(int upToNumber) {
        return Math.abs(random.nextInt()) % upToNumber;
    }

    private String generateExpression() {
        return generateExpression(0);
    }

    private String generateExpression(int depth) {
        if (depth >= minDepth) {
            int variableCharNumber = generateNumberUpTo(26);

            return String.valueOf((char) ('a' + variableCharNumber));
        }

        int availableOptionsCount = 3;

        switch (Math.abs(random.nextInt()) % availableOptionsCount) {
            case 0: {
                int operatorNumber = generateNumberUpTo(UnaryOperators.values().length);

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(UnaryOperators.values()[operatorNumber].getName());
                stringBuilder.append(" ( ");
                stringBuilder.append(generateExpression(depth + 1));
                stringBuilder.append(") ");

                return stringBuilder.toString();
            }

            case 1: {
                int operatorNumber = generateNumberUpTo(BinaryOperators.values().length);

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append("( ");
                stringBuilder.append(generateExpression(depth + 1));
                stringBuilder.append(" ) ");
                stringBuilder.append(BinaryOperators.values()[operatorNumber].getName());
                stringBuilder.append(" ( ");
                stringBuilder.append(generateExpression(depth + 1));
                stringBuilder.append(" )");

                return stringBuilder.toString();
            }

            case 2: {
                int variableCharNumber = generateNumberUpTo(26);

                return String.valueOf((char) ('a' + variableCharNumber));
            }
        }

        return null;
    }

    @Test
    public void badRandom() throws ExpressionParserException, TokenizerParseException {
        minDepth = 10;
        int testsCount = 100;

        for (int i = 0; i < testsCount; i++) {
            String expression = generateExpression();
            setUpExpressionParser(expression);

            assertEquals(formatExpression(expression), node.toString());
        }
    }

    @Test
    public void normalRandom() throws ExpressionParserException, TokenizerParseException {
        minDepth = 100;
        int testsCount = 1000;

        for (int i = 0; i < testsCount; i++) {
            String expression = generateExpression();
            setUpExpressionParser(expression);

            assertEquals(formatExpression(expression), node.toString());
        }
    }

    @Test
    public void stressTest() throws ExpressionParserException, TokenizerParseException {
        int testsCount = 1000_0;

        for (int i = 0; i < testsCount; i++) {
            minDepth = generateNumberUpTo(300) + 1;

            String expression = generateExpression();
            setUpExpressionParser(expression);

            assertEquals(formatExpression(expression), node.toString());
        }
    }
}
