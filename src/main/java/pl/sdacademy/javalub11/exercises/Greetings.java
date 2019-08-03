package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {


        if (name != null) {
            if (name.toUpperCase().equals(name)) {
                String greetings = "Witaj " + name;
                return greetings.toUpperCase();
            } else {
                String[] names = name.split(",");

                if(names.length > 1)
                {
                    return names[0] + " i "+ names[1]+", witajcie!";

                } else {
                    return "Witaj, " + name;
                }
            }
        } else {
            return "Witaj, mój przyjacielu";
        }
    }

}
