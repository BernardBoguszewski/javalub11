package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    //Zad1.1
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

    //Zad1.2
    @Test
    public void testShouldReturnWhenWeHaveNull() {
        //given
        Greetings greetings = new Greetings();
        String name = null;

        //when
        String result = greetings.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    //Zad1.3
    @Test
    public void testShouldReturnOnlyBigLetters() {
        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ, " + name, result);
    }

    //Zad1.4
    @Test
    public void testShouldReturnTwoNames() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza witajcie!", result);
    }

    //Zad1.5
    @Test
    public void testShouldReturnThreeNames(){
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }
}