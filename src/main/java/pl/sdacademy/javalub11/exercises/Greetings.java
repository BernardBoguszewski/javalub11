package pl.sdacademy.javalub11.exercises;


public class Greetings {

    private boolean isNumeric;

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu!";
        } else if (isNumeric = name.chars().anyMatch(Character::isDigit)) {
            return "Z liczbami się nie witam";
        } else if (name == name.toUpperCase()) {
            return "WITAJ " + name + "!";
        } else if (name.contains(",")) {
            String splitName[] = name.split(",");
            if (splitName.length == 3) {
                String splitName1 = splitName[0];
                String splitName2 = splitName[1];
                String splitName3 = splitName[2];
                if (splitName3 == splitName3.toUpperCase()) {
                    return splitName1 + " i " + splitName2 + " witajcie! " + "WITAJ " + splitName3.toUpperCase();
                } else if (splitName2 == splitName3.toUpperCase()) {
                    return splitName1 + " i " + splitName3 + " witajcie! " + "WITAJ " + splitName2.toUpperCase();
                } else if (splitName1 == splitName1.toUpperCase()) {
                    return splitName3.trim() + " i " + splitName2 + " witajcie! " + "WITAJ " + splitName1.toUpperCase();
                }

                return splitName1 + ", " + splitName2 + " i " + splitName3 + ", witajcie!";
            } else {
                String splitName1 = splitName[0];
                String splitName2 = splitName[1];
                return splitName1 + " i " + splitName2 + " witajcie!";
            }

        } else
            return "Witaj, " + name;
    }
}