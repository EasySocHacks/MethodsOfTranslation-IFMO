import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RandomTests extends BaseTests {
    private void runRandomTests(int expressionCount, int maxDepth, int maxLength, int tests) {
        for (int i = 0; i < tests; i++) {
            TestGenerator testGenerator = new TestGenerator(expressionCount, maxDepth, maxLength);

            prepareParser(testGenerator.getExpression());

            assertEquals(testGenerator.getAnswer(), grammarParser.parse().answer);
        }
    }

    @Test
    public void randomTest_1() {
        int expressionCount = 10;
        int maxDepth = 10;
        int maxLength = 10;

        int tests = 10;

        runRandomTests(expressionCount, maxDepth, maxLength, tests);
    }

    @Test
    public void randomTest_2() {
        int expressionCount = 10;
        int maxDepth = 10;
        int maxLength = 10;

        int tests = 100;

        runRandomTests(expressionCount, maxDepth, maxLength, tests);
    }

    @Test
    public void randomTest_3() {
        int expressionCount = 100;
        int maxDepth = 10;
        int maxLength = 10;

        int tests = 1;

        runRandomTests(expressionCount, maxDepth, maxLength, tests);
    }
}
