package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        String name2 = name.replace(",", " i ");

        if (name == null) {
            return "Witaj, mój przyjcielu";
        } else {
            if (name2 != null) {
                name = name2;
                return name + ", witajcie!";
            }
            if (name.equals(name.toUpperCase())) {
                return "WITAJ, " + name.toUpperCase();
            }
            return "Witaj, " + name;
        }
    }


}
