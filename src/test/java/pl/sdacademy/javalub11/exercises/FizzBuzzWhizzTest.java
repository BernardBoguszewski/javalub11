package pl.sdacademy.javalub11.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {

    @Test
    public void testShouldReturnSpecifiedStringWhenParameterFizzBuzzWhizzMethodIsEqualZero() {

        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int digit = 0;

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("Nie dla zer!", result);
    }

    @Test
    public void testShouldReturnSpecifiedStringWhenDigitParameterIsDividedByThree() {

        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int digit = 12;

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("Fizz", result);
    }
}
