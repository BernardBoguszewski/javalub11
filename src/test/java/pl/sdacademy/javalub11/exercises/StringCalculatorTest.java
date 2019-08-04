package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

  /* Requirement 0 */
  @Test
  public void findSeparator() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "//;\n3;5;7";

    // when
    String result = stringCalculator.findSeparator(expression);

    // then
    assertEquals(";", result);
  }

  /* Requirement 1 */
  @Test
  public void testShouldReturnZeroValueWhenEmptyStringWasProvoded() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String emptyString = "";

    // when
    int result = stringCalculator.stringCalculateVer1(emptyString);

    // then
    assertEquals(0, result);
  }

  /* Requirement 1 */
  @Test
  public void testShouldReturnZeroValueWhenNullValueWasProvoded() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String nullString = null;

    // when
    int result = stringCalculator.stringCalculateVer1(nullString);

    // then
    assertEquals(0, result);
  }

  /* Requirement 2 */
  @Test
  public void testShouldVerifyThatMethodCalculateSimpleString() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "3,5";

    // when
    int result = stringCalculator.stringCalculateVer1(expression);

    // then
    assertEquals(8, result);
  }

  /* Requirement 2 */
  @Test
  public void testShouldVerifyThatMethodCalculateThreeValues() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "2,3,5";

    // when
    int result = stringCalculator.stringCalculateVer1(expression);

    // then
    assertEquals(10, result);
  }

  /* Requirement 3 */
  @Test
  public void testShouldVerifyThatMethodCalculateForNewLineAndComa() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "3\n5,3";

    // when
    int result = stringCalculator.stringCalculateVer1(expression);

    // then
    assertEquals(11, result);
  }

  /* Requirement 4 */
  @Test
  public void testShouldVerifyThatMethodCalculateCorreclyForDifferenSeparator() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "//;\n3;5;7";

    // when
    int result = stringCalculator.stringCalculateVer1(expression);

    // then
    assertEquals(15, result);
  }

  /* Requirement 5 */
  @Test(expected = ArithmeticException.class)
  public void testShouldVerifyThatMethodCalculateCorreclyForNegativeValue() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "3,-5";

    // when
    int result = stringCalculator.stringCalculateVer1(expression);

    // then
  }

  /* Requirement 6 */
  @Test
  public void testShouldVerifyThatAlignValuesTo1000() {
    StringCalculator stringCalculator = new StringCalculator();

    // given
    String expression = "1002,5";

    // when
    int result = stringCalculator.stringCalculateVer1(expression);

    // then
    assertEquals(7, result);
  }
}