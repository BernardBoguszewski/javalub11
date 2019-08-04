package pl.sdacademy.javalub11.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    //wymaganie 1
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

    //wymaganie 2
    @Test
    public void testShouldReturnProperGreetingNull() {
        //given
        Greetings greetings = new Greetings();
        String name = null;

        //when
        String result = greetings.greet(null);

        //then
        assertEquals("Witaj moj przyjacielu", result);

    }

    //wymaganie 3
    @Test
    public void testShouldReturnProperGreetingToUppearName() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam";

        //when
        String result = greetings.greet(name.toUpperCase());

        //then
        assertEquals("WITAJ ADAM", result);

    }

    //wymaganie 4

    @Test
    public void testShouldReturnProperGreetingSplit() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam i Iza witajcie!", result);
    }

    @Test
    public void testShouldReturnProperGreetingSplit2() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Adam,Iza i Robert witajcie!", result);
    }

}