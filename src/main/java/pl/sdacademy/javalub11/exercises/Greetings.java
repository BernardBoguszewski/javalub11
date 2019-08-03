package pl.sdacademy.javalub11.exercises;

public class Greetings {

    private int commaCounting(String name) {
        return name.split("\\,", -1).length - 1;

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

        }if (commaCounting(name) == 1) {
            return getOneComma(name);
        }
        if (name != null) {
            return "Witaj, " + name;
        }
        return name;
    }

    private String getTwoComma(String name) {
        String[] split = name.split(",");
        return split[0] + "," +split[1] + " i " + split[2] + ", witajcie!";
    }

    private String getOneComma(String name) {
        String[] split = name.split(",");
        return split[0] + " i " + split[1] + ", witajcie!";
    }


}
