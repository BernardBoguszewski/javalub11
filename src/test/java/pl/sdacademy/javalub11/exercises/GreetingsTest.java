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
    public void testShouldNullSupport() {
        //given
        Greetings greetings = new Greetings();
        String name = null;
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Witaj mój przyjacielu",result);
    }

    @Test
    public void testShouldRecognizeUpperLetter() {
        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("WITAJ "+name+"!",result);
    }

    @Test
    public void testShouldReturnStringWithTwoName() {
        //given
        Greetings greetings = new Greetings();
        String name = "Adam,Ewa";
        //when
        String result = greetings.greet(name);
        //then
        assertEquals("Adam i Ewa, witajcie!",result);
    }
}