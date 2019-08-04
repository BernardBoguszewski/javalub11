package pl.sdacademy.javalub11.exercises;

public class Greetings {

    public String greet(String name) {
        if (name == null) {
            return "Witaj moj przyjacielu";
        }
        if(name==name.toUpperCase()){
            return "WITAJ "+name.toUpperCase();
        }
        if(name.contains(",")){
            String tablica[]=name.split(",");
            if(tablica.length==3){
                return tablica[0] + "," + tablica[1] + " i "+ tablica[2]+ " witajcie!";
            }
            else {
                return tablica[0] + " i " + tablica[1] + " witajcie!";
            }
        }

        else {
            return "Witaj, " + name;
        }

    }
}


