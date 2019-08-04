package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {

        if (name == null) {
            return "Witaj, mój przyjcielu";
        }
        String tabName1[] = name.split(",");

        if (tabName1.length == 3 && tabName1[2].equals(tabName1[2].toUpperCase())) {
            return nameStringUper3(name);
        }

        if (tabName1.length == 3) {
            return nameString3(name);
        }

        if (tabName1.length == 2) {
            return nameString2(name);
        }
        if (name.equals(name.toUpperCase())) {
            return "WITAJ, " + name.toUpperCase();
        }

        return "Witaj, " + name;
    }

    private String nameString2(String name) {
        String tabName1[] = name.split(",");
        name = tabName1[0] + " i " + tabName1[1];
        return name + ", witajcie!";
    }

    private String nameString3(String name) {
        String tabName1[] = name.split(",");
        name = tabName1[0] + "," + tabName1[1] + " i " + tabName1[2];
        return name + ", witajcie!";
    }

    private String nameStringUper3(String name) {
        String tabName1[] = name.split(",");
        name = tabName1[0] + " i " + tabName1[1] + ", witajcie! WITAJ " + tabName1[2].toUpperCase() + "!";
        return name;
    }

}

