package pl.sdacademy.javalub11.exercises;

import java.util.ArrayList;

public class Greetings {

    public String greet(String name) {

        if (name != null) {

            if(name.matches(".*\\d.*")){
                return "Z liczbami się nie witam.";
            }

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

        ArrayList upperCaseNames = new ArrayList();
        ArrayList lowerCaseNames = new ArrayList();

        for(String name: namesArray){
            if(name.toUpperCase().equals(name)){
                upperCaseNames.add(name);
            } else {
                lowerCaseNames.add(name);
            }
        }

        StringBuilder greetings = new StringBuilder(namesArray[0]);

        for (int i = 1; i < lowerCaseNames.size(); ++i) {

            if (i <= lowerCaseNames.size() - 2) {
                greetings.append(", ");
            }
            if (i == lowerCaseNames.size() - 1) {
                greetings.append(" i ");
            }
            greetings.append(lowerCaseNames.get(i));
        }

        greetings.append(", witajcie!");

        String uppgerGreatings = "";
        if(upperCaseNames.size() > 0){
            uppgerGreatings += " WITAJ " + upperCaseNames.get(0) + "!";
        }

        return greetings+uppgerGreatings;
    }

}
