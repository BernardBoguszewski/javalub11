package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {

        if (name != null) {
            if (name.toUpperCase().equals(name)) {
                String greetings = "Witaj " + name;
                return greetings.toUpperCase();
            } else {
                return "Witaj, " + name;
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

}
