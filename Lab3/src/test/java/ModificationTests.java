import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModificationTests extends BaseTests {
    @Test
    public void powTest_1() {
        String expression = "a = 2 ** 3;";
        String answer = "a = 8\n";

        prepareParser(expression);

        assertEquals(answer, grammarParser.parse().answer);
    }

    @Test
    public void powTest_2() {
        String expression = "a = 2 ** 3 ** 2;";
        String answer = "a = 512\n";

        prepareParser(expression);

        assertEquals(answer, grammarParser.parse().answer);
    }

    @Test
    public void powTest_3() {
        String expression = "a = 1 + 4 * 2 ** 3 ** 2;";
        String answer = "a = 2049\n";

        prepareParser(expression);

        assertEquals(answer, grammarParser.parse().answer);
    }
}
