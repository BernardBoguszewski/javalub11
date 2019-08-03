package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    @Test
    public void testShouldReturnProperGreeting() { //wymaganie 1
        //given
        Greetings greetings = new Greetings();
        String name = "Adam";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, " + name, result);

    }

    @Test
    public void testShouldReturnProperGreetingForNull() { //wymaganie 2
        //given
        Greetings greetings = new Greetings();
        String name = null;

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, mój przyjcielu", result);

    }

    @Test
    public void testShouldReturnProperGreetingUpperCase() { //wymaganie 3
        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, ADAM", result);
    }


}