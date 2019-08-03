package pl.sdacademy.javalub11.exercises;

public class Greetings {


    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu!";
        } else if (name == name.toUpperCase()) {
            return "WITAJ " + name + "!";
        } else if (name.contains(",")){
            String splitName[] = name.split(",");
            String splitName1 = splitName[0];
            String splitName2 = splitName[1];
            return "Witaj, " + splitName1 + " i " + splitName2;
        }else{}
            return "Witaj, " + name;
    }
}