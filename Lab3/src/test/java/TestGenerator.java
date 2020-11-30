import java.util.*;

public class TestGenerator {
    private final StringBuilder expression = new StringBuilder();
    private final StringBuilder answer = new StringBuilder();

    private final Stack<String> stack = new Stack<String>();
    private final ExpressionResultList variableValues = new ExpressionResultList();

    private final int expressionCount;
    private final int expressionMaxDepth;
    private final int expressionMaxLength;

    private final Random random = new Random();

    public TestGenerator(int expressionCount, int expressionMaxDepth, int expressionMaxLength) {
        this.expressionCount = expressionCount;
        this.expressionMaxDepth = expressionMaxDepth;
        this.expressionMaxLength = expressionMaxLength;

        generateTest();
    }

    private int generateIntUpTo(int upToInt) {
        return Math.abs(random.nextInt()) % upToInt;
    }

    private void generateTest() {
        for (int currentExpressionNumber = 0; currentExpressionNumber < expressionCount; currentExpressionNumber++) {
            if (currentExpressionNumber != 0) {
                expression.append("\n");
                answer.append("\n");
            }

            char currentVariableName = (char) ('a' + generateIntUpTo(26));

            int value = generateExpression(0, 0);

            expression.append(currentVariableName);
            expression.append(" = ");
            expression.append(stack.pop());
            expression.append(";");

            answer.append(currentVariableName);
            answer.append(" = ");
            answer.append(value);

            variableValues.insert(new ExpressionResult(String.valueOf(currentVariableName), value));
        }
    }

    private int generateExpression(int currentDepth, int currentLength) {
        int operationType = generateIntUpTo(6);

        if (currentDepth >= expressionMaxDepth || currentLength >= expressionMaxLength) {
            operationType = generateIntUpTo(2);
        }

        if (operationType == 1 && variableValues.getExpressionResultList().size() == 0) {
            operationType = 0;
        }

        switch (operationType) {
            case 0: {
                int value = random.nextInt();
                stack.push(String.valueOf(value));

                return value;
            }

            case 1: {
                ExpressionResult expressionResult =
                        variableValues.getExpressionResultList().get(generateIntUpTo(variableValues.getExpressionResultList().size()));

                String variableName = expressionResult.getName();
                int value = variableValues.getValue(variableName);

                stack.push(variableName);

                return value;
            }

            case 2: {
                int valueL = generateExpression(currentDepth + 1, currentLength);
                int valueR = generateExpression(currentDepth + 1, currentLength + 1);

                String stringValueR = stack.pop();
                String stringValueL = stack.pop();

                stack.push("(" + stringValueL + ") + (" + stringValueR + ")");

                return valueL + valueR;
            }

            case 3: {
                int valueL = generateExpression(currentDepth + 1, currentLength);
                int valueR = generateExpression(currentDepth + 1, currentLength + 1);

                String stringValueR = stack.pop();
                String stringValueL = stack.pop();

                stack.push("(" + stringValueL + ") - (" + stringValueR + ")");

                return valueL - valueR;
            }

            case 4: {
                int valueL = generateExpression(currentDepth + 1, currentLength);
                int valueR = generateExpression(currentDepth + 1, currentLength + 1);

                String stringValueR = stack.pop();
                String stringValueL = stack.pop();

                stack.push("(" + stringValueL + ") * (" + stringValueR + ")");

                return valueL * valueR;
            }

            case 5: {
                int valueL = generateExpression(currentDepth + 1, currentLength);
                int valueR = generateExpression(currentDepth + 1, currentLength + 1);

                String stringValueR = stack.pop();
                String stringValueL = stack.pop();

                if (valueR == 0) {
                    valueR = 1;

                    stringValueR = "(" + stringValueR + " + 1)";
                }

                stack.push("(" + stringValueL + ") / (" + stringValueR + ")");

                return valueL / valueR;
            }
        }
        return 0;
    }

    public String getExpression() {
        return expression.toString();
    }

    public String getAnswer() {
        return answer.toString() + "\n";
    }
}
