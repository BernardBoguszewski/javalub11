package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        if(name != null) {
            return "Witaj, " + name;
        }else {
            return "Witaj, mój przyjacielu";
        }
    }

}
