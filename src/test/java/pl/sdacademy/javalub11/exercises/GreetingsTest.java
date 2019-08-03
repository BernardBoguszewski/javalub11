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
    public void testParameterGreetingsMethodShouldBeNotNull(){
        //given
        Greetings greetings = new Greetings();

        //when
        String result = greetings.greet(null);

        //then
        assertEquals("Witaj, mój przyjacielu", result);
    }

    @Test
    public void testShouldReturnCapitalizedStringIfParameterNameIsCapitalized(){
        //given
        Greetings greetings = new Greetings();
        String name = "ADAM";

        //when
        String result = greetings.greet(name);

        //then
        assertEquals("WITAJ ADAM", result);
    }

    @Test
    public void testShouldReturnGreetingsforTwoNamesIfTheyWasGeivenAfterTheComma(){
        //given
        Greetings greetings = new Greetings();
        String names = "Adam,Iza";

        //when
        String result = greetings.greet(names);

        //then
        assertEquals("Adam i Iza, witajcie!", result);
    }

    @Test
    public void testShouldReturnGreetingsforThreeNamesIfTheyWasGeivenAfterTheComma(){
        //given
        Greetings greetings = new Greetings();
        String names = "Adam,Iza,Robert";

        //when
        String result = greetings.greet(names);

        //then
        assertEquals("Adam, Iza i Robert, witajcie!", result);
    }

    @Test
    public void testShouldReturnSpecialGreetingsForNameWhichInNamesListIsWrittenUpperCases(){
        //given
        Greetings greetings = new Greetings();
        String names = "Adam,Iza,Robert,MARIUSZ";

        //when
        String result = greetings.greet(names);

        //then
        assertEquals("Adam, Iza i Robert, witajcie! WITAJ MARIUSZ!", result);
    }
}