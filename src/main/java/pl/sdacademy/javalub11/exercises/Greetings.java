package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjcielu";
        } else {
            if (name.equals(name.toUpperCase())) {
                return "WITAJ, " + name.toUpperCase();
            }
            return "Witaj, " + name;
        }
    }


}
