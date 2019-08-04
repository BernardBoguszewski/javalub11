package pl.sdacademy.javalub11.exercises;

import java.util.ArrayList;

public class Greetings {

    private String upper;

    private int commaCounting(String name) {
        return name.split("\\,", -1).length - 1;
    }

    private boolean isIfAllUpperCase(String s) {
        return s.matches("[A-Z]+");
    }

    public String greet(String name) {

        if (name == null) {
            return "Witaj mój przyjacielu";
        }
        if (name.equals(name.toUpperCase())) {
            return "WITAJ " + name + "!";
        }
        if (commaCounting(name) == 2) {
            return getTwoComma(name);

        }
        if (commaCounting(name) == 1) {
            return getOneComma(name);
        }
        if (name != null) {
            return "Witaj, " + name;
        }
        return name;
    }

    private String getTwoComma(String name) {
        int licz = 0;
        ArrayList lower = new ArrayList();
        String[] split = name.split(",");
        for (int i = 0; i < split.length; i++) {
            String part = split[i];
            if (isIfAllUpperCase(part)) {
                upper = "WITAJ " + split[i] + "!";
                licz++;
            } else {
                lower.add(split[i]);
            }
        }
        if (licz == 1) {
            return lower.get(0) + " i " + lower.get(1) + ", witajcie! " + upper;
        } else {
            return split[0] + "," + split[1] + " i " + split[2] + ", witajcie!";

        }
    }

    private String getOneComma(String name) {
        String[] split = name.split(",");
        return split[0] + " i " + split[1] + ", witajcie!";
    }


}
