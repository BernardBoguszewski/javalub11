package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj moj przyjacielu";
        } else if (name != null && name==name.toLowerCase()) {
            return "Witaj, " + name;
        } else if (name == name.toUpperCase()) {
            return "WITAJ " + name;
        }
        return name;
    }}