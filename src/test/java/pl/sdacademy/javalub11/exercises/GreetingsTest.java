package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

  @Test
  public void testShouldReturnTrueForStringWithDigit()
  {
    Greetings greetings = new Greetings();

    //given
    String name = "AA5DDD";

    //when
    boolean result = greetings.isDigitInString(name);

    //then
    assertEquals(true, result);
  }

  @Test
  public void testShouldReturnFalseForStringWithoutDigit()
  {
    Greetings greetings = new Greetings();

    //given
    String name = "AADDD";

    //when
    boolean result = greetings.isDigitInString(name);

    //then
    assertEquals(false, result);
  }

  @Test
  public void testShouldCorectlyCountsExsistanceOfUpperCaseOccurence()
  {
    Greetings greetings = new Greetings();

    //given
    String name = "Adam";

    //when
    int count = greetings.countUpper(name);

    //then
    assertEquals(0, count);
  }

  @Test
  public void testShouldCorectlyCountsExsistanceOfUpperCaseOccurenceInStringWithUpperName()
  {
    Greetings greetings = new Greetings();

    //given
    String name = "ADAM";

    //when
    int count = greetings.countUpper(name);

    //then
    assertEquals(1, count);
  }

  @Test
  public void testShouldCorectlyCountsExsistanceOfUpperCaseOccurenceInStringWithUpperAndWithOut()
  {
    Greetings greetings = new Greetings();

    //given
    String name = "ADAM, Kasia";

    //when
    int count = greetings.countUpper(name);

    //then
    assertEquals(1, count);
  }

  @Test
  public void testShouldCorreclyCountUpperNamesInStringWithUpperNameRepeatedTwice()
  {
    Greetings greetings = new Greetings();

    //given
    String name = "ADAM, KATARZYNA";

    //when
    int count = greetings.countUpper(name);

    //then
    assertEquals(2, count);
  }

  /* requirement 1 */
  @Test
  public void testShouldReturnProperGreeting() {
    // given
    Greetings greetings = new Greetings();
    String name = "Adam";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Witaj, " + name, result);
  }

  /* requirement 1 */
  @Test
  public void testShouldReturnProperGreetingforSecondCase() {
    // given
    Greetings greetings = new Greetings();
    String name = "Łukasz";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Witaj, " + name, result);
  }

  /* requirement 2 */
  @Test
  public void testShouldCheckProtectionAgainstNullValue() {
    // given
    Greetings greetings = new Greetings();
    String name = null;

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Witaj, mój przyjacielu", result);
  }

  /* requirement 3 */
  @Test
  public void testShouldUpperCaseGreetingPrefixOnceParamIsUpperCaseTooFirstCase() {
    // given
    Greetings greetings = new Greetings();
    String name = "ADAM";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("WITAJ ADAM!", result);
  }

  /* requirement 3 */
  @Test
  public void testShouldUpperCaseGreetingPrefixOnceParamIsUpperCaseTooSecondCase() {
    // given
    Greetings greetings = new Greetings();
    String name = "TOMEK";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("WITAJ TOMEK!", result);
  }

  /* requirement 4 */
  @Test
  public void testShouldCheckIfMehodWorksCorrectlyTwoParameters() {
    // given
    Greetings greetings = new Greetings();
    String name = "Adam,Iza";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Adam i Iza, witajcie!", result);
  }

  /* requirement 5 */
  @Test
  public void testShouldCheckIfMehodWorksCorrectlyThreeParameters() {
    // given
    Greetings greetings = new Greetings();
    String name = "Adam,Iza,Robert";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Adam, Iza i Robert, witajcie!", result);
  }

  /* requirement 5  */
  @Test
  public void testShouldCheckIfMehodWorksCorrectlyForMoreThanThreeParameters() {
    // given
    Greetings greetings = new Greetings();
    String name = "AA,BB,CC,DD";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("WITAJCIE AA, BB, CC i DD!", result);
  }

  /* requirement 6 */
  @Test
  public void testShouldCheckIfMehodWorksForDifferentUpperCaseNames() {
    // given
    Greetings greetings = new Greetings();
    String name = "Adam, Iza, ROBERT";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
  }

  /* requirement 7 */
  @Test
  public void testShouldCheckIfMehodRefuseWorkWithNamesRepeatedByNumbers() {
    // given
    Greetings greetings = new Greetings();
    String name = "Adam, Iza, ROBE8RT";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Z liczbami sie nie witam.", result);
  }
}
