package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        String tabName1[] = name.split(",");


        if (name == null) {
            return "Witaj, mój przyjcielu";

        } else {

            if (tabName1.length == 2) {
                name = tabName1[0] + " i " + tabName1[1];

                return name + ", witajcie!";
            } else {
                if (tabName1.length == 3) {
                    name = tabName1[0] + "," + tabName1[1] + " i " + tabName1[2];

                    return name + ", witajcie!";
                    //Adam i Iza, witajcie! WITAJ ROBERT!
                }

                if (name.equals(name.toUpperCase())) {
                    return "WITAJ, " + name.toUpperCase();
                }
                return "Witaj, " + name;
            }
        }
    }
}
