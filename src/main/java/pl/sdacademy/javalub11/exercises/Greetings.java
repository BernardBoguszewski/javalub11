package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else if (name == name.toUpperCase()) {
            return "WITAJ, " + name;
        } else if (name.contains(",")) {
            String tablica[] = name.split(",");
            String tablica1 = tablica[0];
            String tablica2 = tablica[1];
            return tablica1 + " i " + tablica2 + " witajcie!";
        } else {
            return "Witaj, " + name;
        }
    }
}
