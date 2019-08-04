package pl.sdacademy.javalub11.exercises;

import org.springframework.util.StringUtils;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else if (name.equals(name.toUpperCase())) {
            return "WITAJ, " + name;
        } else if (name.contains(",")) {
            String[] imiona = name.split(",");
            String imie1 = imiona[0];
            String imie2 = imiona[1];
            return imie1 + " i " + imie2 + ", witajcie!";
        } else {
            return "Witaj, " + name;
        }

    }

}
