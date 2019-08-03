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
    public void testShouldReturnSpecifiedStringWhenDigitParameterIsDividedByThreeAndNotByFive() {

        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int digit = 12;

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    public void testShouldReturnSpecifiedStringWhenDigitParameterIsDividedByFiveAndNotByThree() {

        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int digit = 10;

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    public void testShouldReturnSpecifiedStringWhenDigitParameterIsDividedByFiveAndThree() {

        //given
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        int digit = 15;

        //when
        String result = fizzBuzzWhizz.fizzBuzzWhizz(digit);

        //then
        assertEquals("FizzBuzz", result);
    }
}
