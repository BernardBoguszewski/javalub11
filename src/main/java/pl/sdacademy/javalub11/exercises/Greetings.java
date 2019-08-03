package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {

        String result = "Witaj, mój przyjacielu";

        if(name == null) return result;

        String upperCase = name.toUpperCase();

        if(name.equals(upperCase))
        {
            result = "WITAJ, " + upperCase + "!";
        } else
        {
            result = "Witaj, " + name;
        }

        return result;
    }

}
