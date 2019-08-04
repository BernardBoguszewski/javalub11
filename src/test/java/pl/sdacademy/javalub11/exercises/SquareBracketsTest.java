package pl.sdacademy.javalub11.exercises;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SquareBracketsTest {

    private String brackets;
    private boolean expected;
    private boolean result;

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{"[]", true}, {"[][]", true}, {"[[][]]", true}, {"][", false},{"][][", false}, {"[]][[]", false}});
    }

    public SquareBracketsTest(String brackets, boolean expected) {
        //given
        SquareBrackets squareBrackets = new SquareBrackets();
        this.brackets = brackets;
        this.expected = expected;

        //when
        this.result = squareBrackets.isClosed(brackets);
    }

    @Test
    public void testShouldReturnSpecifiedStringsWhenDigitIsPrimeNumberWithTwoOptionsForDigitThreeAndFive() {
        //then
        Assert.assertEquals(expected, result);
    }
}
