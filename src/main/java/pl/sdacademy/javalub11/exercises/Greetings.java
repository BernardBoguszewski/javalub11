package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {

        if (name==null) {
            return "Witaj mój przyjacielu";
        } else {
            return "Witaj, " + name;
        }
    }

}
