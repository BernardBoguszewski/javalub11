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
  public void testShouldReturnProperGreetingForNullName() {
    // given
    Greetings greetings = new Greetings();
    String name = null;

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Witaj, mój przyjacielu.", result);
  }

  @Test
  public void testShouldReturnUpperCaseGreeting() {
    // given
    Greetings greetings = new Greetings();
    String name = "ADAM";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("WITAJ, " + name + "!", result);
  }

  @Test
  public void testShouldReturnGreetingForTwoNames() {
    // given
    Greetings greetings = new Greetings();
    String name = "Ania,Adam";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Ania i Adam, witajcie!", result);
  }

  @Test
  public void testShouldReturnGreetingForThreeNames() {
    // given
    Greetings greetings = new Greetings();
    String name = "Ania,Adam,Robert";

    // when
    String result = greetings.greet(name);

    // then
    assertEquals("Ania, Adam i Robert, witajcie!", result);
  }
}
