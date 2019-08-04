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

    @Test
    public void testShouldReturnProperGreetingForNames() { //wymaganie 4
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void testShouldReturnProperGreetingFor3Names() { //wymaganie 5
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam,Iza i Robert, witajcie!", result);
    }

    @Test
    public void testShouldReturnProperGreetingFor3NamesUpperCase() { //wymaganie 6
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,ROBERT";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void testShouldReturnProperGreetingForNumber() { //wymaganie 7
        //given
        Greetings greetings = new Greetings();
        String name = "12548";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Z liczbami się nie witam.", result);
    }

}