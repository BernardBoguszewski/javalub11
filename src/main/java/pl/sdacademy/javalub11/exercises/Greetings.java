package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {


        if (name != null) {
            if (name.toUpperCase().equals(name)) {
                String greetings = "Witaj " + name;
                return greetings.toUpperCase();
            } else {
                String[] names = name.split(",");

                if (names.length > 1) {
                    return createGreetingsStringFromNamesList(name);
                } else {
                    return "Witaj, " + name;
                }
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

    private String createGreetingsStringFromNamesList(String names) {

        String[] namesArray = names.split(",");
        String greetings = "";

        greetings += namesArray[0];

        for (int i = 1; i < namesArray.length; ++i) {

            if (i <= namesArray.length - 2) {
                greetings += ", ";
            }
            if (i == namesArray.length - 1) {
                greetings += " i ";
            }
            greetings += namesArray[i];
        }
        greetings += ", witajcie!";

        return greetings;
    }

}
