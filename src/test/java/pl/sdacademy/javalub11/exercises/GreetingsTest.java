package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Test
    public void testShouldReturnProperGreeting() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, " + name, result);

    }

    @Test
    public void testShouldReturnFriendlyGreetingIfNull() {
        //given
        Greetings greetings = new Greetings();
        String name = null;

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjacielu!", result);

    }

    @Test
    public void testShouldReturnCapitalLettersIfGiven() {
        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ ADAM!", result);
    }

    @Test
    public void testShouldReturnTwoNamesifGivenAfterComma() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza witajcie!", result);
    }

    @Test
    public void testShouldReturnMoreNameIfGivenAfterComma() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);

    }

    @Test
    public void testShouldReturnMoreNamesIfGivenAfterCommaInculdingCapitalLetters() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,ROBERT";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza witajcie! WITAJ ROBERT", result);
    }

    @Test
    public void testShouldReturnSpecialGreetingIfANumberIsGiven() {
        //given
        Greetings greetings = new Greetings();
        String name = "7";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Z liczbami się nie witam", result);
    }
}