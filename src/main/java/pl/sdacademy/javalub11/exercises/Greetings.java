package pl.sdacademy.javalub11.exercises;

public class Greetings {


    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu!";
        } else if (name == name.toUpperCase()) {
            return "WITAJ " + name + "!";
        } else if (name.contains(",")) {
            String splitName[] = name.split(",");
            if (splitName.length == 3) {
                String splitName1 = splitName[0];
                String splitName2 = splitName[1];
                String splitName3 = splitName[2];
                return splitName1 + ", " + splitName2 + " i " + splitName3 + ", witajcie!";
            } else {
                String splitName1 = splitName[0];
                String splitName2 = splitName[1];
                return splitName1 + " i " + splitName2 + " witajcie!";
            }
        } else {
        }
        return "Witaj, " + name;
    }
}