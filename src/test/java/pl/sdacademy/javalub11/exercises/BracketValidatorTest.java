package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketValidatorTest {

  @Test
  public void testShouldReturnTrueForSinglePairOfBracketsWithCorrectOrder() {
      // given
      BracketValidator bracketValidator = new BracketValidator();

      String name = "[]";

      // when
      Boolean result = bracketValidator.validator(name);

      // then
      assertEquals(true, result);
  }

    @Test
    public void testShouldReturnTrueForSinglePairOfBracketsInCorrectOrderRepeatedTwice() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "[][]";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(true, result);
    }

    @Test
    public void testShouldReturnTrueForNestedPairOfBrackets() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "[[][]]";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(true, result);
    }


    @Test
    public void testShouldReturnFalseForSinglePairOfBracketsWithIncorrectOrder() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "][";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(false, result);
    }

    @Test
    public void testShouldReturnFalseForNestedBracketsWithIncorrectOrder() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "][][";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(false, result);
    }

    @Test
    public void testShouldReturnFalseForWrongNestedBrackets() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "[]][[]";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(false, result);
    }

    @Test
    public void testShouldReturnFalseForWrongNestedBracketsSecondCase() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "[[]][[]][[]";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(false, result);
    }

    @Test
    public void testShouldReturnTrueForProperNestedBracketsSecondCase() {
        // given
        BracketValidator bracketValidator = new BracketValidator();

        String name = "[[[]][[][]][[]]]";

        // when
        Boolean result = bracketValidator.validator(name);

        // then
        assertEquals(true, result);
    }
}