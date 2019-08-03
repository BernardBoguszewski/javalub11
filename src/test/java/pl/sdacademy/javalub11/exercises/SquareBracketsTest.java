package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareBracketsTest {

    @Test
    public void testShouldReturnTrueIfSquareBracketsWillBeClosed(){
        //given
        SquareBrackets squareBrackets = new SquareBrackets();
        String brackets = "[[[]]][]";

        //when
        Boolean result = squareBrackets.isClosed(brackets);

        //then
        assertTrue(result);
    }
}