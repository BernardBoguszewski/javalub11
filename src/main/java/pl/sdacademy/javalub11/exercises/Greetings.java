package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj, mój przyjacielu";
        } else if (name == name.toUpperCase()) {
            return "WITAJ, " + name;
        } else if (name.contains(",")) {
            String splitTable[] = name.split(",");
            if (splitTable.length == 3) {
                String tablica1 = splitTable[0];
                String tablica2 = splitTable[1];
                String tablica3 = splitTable[2];
                return tablica1 + ", " + tablica2 + " i " + tablica3 + "," + " witajcie!";
            } else {
                String tablica1 = splitTable[0];
                String tablica2 = splitTable[1];
                return tablica1 + " i " + tablica2 + " witajcie!";
            }
        } else {
            return "Witaj, " + name;
        }
    }
}
