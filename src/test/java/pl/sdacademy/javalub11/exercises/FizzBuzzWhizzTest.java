package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzWhizzTest {

  /* Requitement 1 */
  @Test
  public void testShouldReturnProperMessageForZeroValue() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 0;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("Nie dla zer!", result);
  }

  /* Requitement 2 */
  @Test
  public void testShouldReturnFizzMessageForValueDividedByThree() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 6;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("Fizz", result);
  }

  /* Requitement 3 */
  @Test
  public void testShouldReturnBuzzMessageForValueDividedByFive() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 10;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("Buzz", result);
  }

  /* Requitement 4 */
  @Test
  public void testShouldReturnFizzBuzzMessageForValueDividedByThreeAndFive() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 15;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("FizzBuzz", result);
  }

  /* Requitement 5 */
  @Test
  public void testShouldReturnWhizzMessageForPrimeValues() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 7;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("Whizz", result);
  }

  /* Requitement 5a */
  @Test
  public void testShouldReturnFizzWhizzMessageForValuesThree() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 3;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("FizzWhizz", result);
  }

  /* Requitement 5b */
  @Test
  public void testShouldReturnBuzzWhizzMessageForValuesFive() {
    FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

    // given
    int value = 5;

    // when
    String result = fizzBuzzWhizz.fizzBuzzWhizz(value);

    // then
    assertEquals("BuzzWhizz", result);
  }
}
