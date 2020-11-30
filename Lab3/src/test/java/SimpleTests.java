import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleTests extends BaseTests {
    @Test
    public void UnitTest_1() {
        String expression = " a = 1;\nb=2; \nc= 3;\n   d     =      4;";
        String answer = "a = 1\nb = 2\nc = 3\nd = 4\n";

        prepareParser(expression);

        assertEquals(answer, grammarParser.parse().answer);
    }

    @Test
    public void UnitTest_2() {
        String expression = " a = 1;\nb = 1;\nc = a + b; \nd = b + c;\n e = c + d;";
        String answer = "a = 1\nb = 1\nc = 2\nd = 3\ne = 5\n";

        prepareParser(expression);

        assertEquals(answer, grammarParser.parse().answer);
    }

    @Test
    public void UnitTest_3() {
        String expression = " a = 1 + (3/ 5) * 10 + 1 * (2 - 1 + 1 - 1 * 10 / 10);";
        String answer = "a = 2\n";

        prepareParser(expression);

        assertEquals(answer, grammarParser.parse().answer);
    }
}
