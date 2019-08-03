package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj moj przyjacielu";
        }
        if(name==name.toUpperCase()){
            return "WITAJ "+name.toUpperCase();
        }
        else {
            return "Witaj, " + name;
        }

    }
}


