package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testShouldCheckMethodAddAddsCocectlyDigitsThreeAndFiveGivenInStringParameters(){
        //given
        String digitsToAdd = "3,5";
        StringCalculator stringCalculator = new StringCalculator();

        //when
        long result = stringCalculator.add(digitsToAdd);

        //then
        assertEquals(8l, result);
    }

    @Test
    public void testShouldCheckMethodAddCorrectlySupportEmptyInputString(){
        //given
        String digitsToAdd = "";
        StringCalculator stringCalculator = new StringCalculator();

        //when
        long result = stringCalculator.add(digitsToAdd);

        //then
        assertEquals(0l, result);
    }

    @Test
    public void testShouldCheckMethodAddCorrectlySupportNullValueAsInputParameter(){
        //given
        String digitsToAdd = null;
        StringCalculator stringCalculator = new StringCalculator();

        //when
        long result = stringCalculator.add(digitsToAdd);

        //then
        assertEquals(0l, result);
    }

    @Test
    public void testShouldCheckMethodAddCanCorrectlyAddsMultipleDigits(){
        //given
        String digitsToAdd = "2,3,5";
        StringCalculator stringCalculator = new StringCalculator();

        //when
        long result = stringCalculator.add(digitsToAdd);

        //then
        assertEquals(10L, result);
    }

    @Test
    public void testShouldCheckMethodAddCanCorrectlyInterpretingNewLineCodeAndComaAsDigitsDelimiter(){
        //given
        String digitsToAdd = "3\n5,3";
        StringCalculator stringCalculator = new StringCalculator();

        //when
        long result = stringCalculator.add(digitsToAdd);

        //then
        assertEquals(11L, result);
    }

    @Test
    public void testShouldCheckAddMethodCanCorrectlyExtractDelimiterFromInputStringAndUseIt(){
        //given
        String digitsToAdd = "//;\n3;5;7";
        StringCalculator stringCalculator = new StringCalculator();

        //when
        long result = stringCalculator.add(digitsToAdd);

        //then
        assertEquals(15L, result);
    }
}