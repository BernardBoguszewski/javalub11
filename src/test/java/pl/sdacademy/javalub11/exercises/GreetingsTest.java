package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

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

  @Test
  public void testShouldUpperCaseGreetingPrefixOnceParamIsUpperCaseTooFirstCase() {
    // given
    Greetings greetings = new Greetings();
    String name = "ADAM";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("WITAJ, ADAM!", result);
  }

  @Test
  public void testShouldUpperCaseGreetingPrefixOnceParamIsUpperCaseTooSecondCase() {
    // given
    Greetings greetings = new Greetings();
    String name = "TOMEK";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("WITAJ, TOMEK!", result);
  }

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
}
