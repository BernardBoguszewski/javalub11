package pl.sdacademy.javalub11.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {

    private Greetings greetings;

    @Before
    public void setUp() {
        greetings = new Greetings();
    }

    @Test
    public void testShouldReturnProperGreeting() {
        //given
        String name = "Adam";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("Witaj, " + name, result);

    }

    @Test
    public void testShouldNullSupport() {
        //given
        String name = null;
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Witaj mój przyjacielu", result);
    }

    @Test
    public void testShouldRecognizeUpperLetter() {
        //given
        String name = "ADAM";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("WITAJ " + name + "!", result);
    }

    @Test
    public void testShouldReturnStringWithTwoName() {
        //given
        String name = "Adam,Ewa";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam i Ewa, witajcie!", result);
    }

    @Test
    public void testShouldReturnStringWithTreeName() {
        //given
        String name = "Adam,Iza,Robert";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam,Iza i Robert, witajcie!", result);
    }

    @Test
    public void testShouldReturnStringWithOneUpperLetter() {
        //given
        String name = "Adam,Iza,ROBERT";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }

    @Test
    public void testShouldReturnStringWhenDigit() {
        //given
        String name = "Adam22,Iza,ROBERT";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Z liczbami się nie witam", result);
    }


}