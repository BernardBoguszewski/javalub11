package pl.sdacademy.javalub11.exercises;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzWhizzPrimeNumbersTest {

    private int digit;
    private String result;
    private String expected;

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{{2, "Whizz"}, {3, "FizzWhizz"}, {5, "BuzzWhizz"}, {0, "Nie dla zer!"},{7, "Whizz"}, {11, "Whizz"}, {8, ""}});
    }

    public FizzBuzzWhizzPrimeNumbersTest(int digit, String expected) {
        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        this.digit = digit;
        this.expected = expected;

        //when
        this.result = fizzBuzzWhizz.isPrime(digit);
    }

    @Test
    public void testShouldReturnSpecifiedStringsWhenDigitIsPrimeNumberWithTwoOptionsForDigitThreeAndFive() {
        //then
        Assert.assertEquals(expected, result);
    }
}
