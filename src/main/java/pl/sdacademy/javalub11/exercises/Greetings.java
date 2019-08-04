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
                if(tablica[0]==tablica[0].toUpperCase() || tablica[1]==tablica[1].toUpperCase() || tablica[2]==tablica[2].toUpperCase() ){
                    if((tablica[0].matches(".*\\d.*"))||(tablica[1].matches(".*\\d.*"))||(tablica[2].matches(".*\\d.*"))){//do sprawdzania czy jest jakas liczba
                        return "Z liczbami sie nie witam!";
                    }
                    return tablica[0] + " i " + tablica[1] + ",witajcie! "+ "Witaj "+ tablica[2].toUpperCase();
                }
                else {
                    return tablica[0] + "," + tablica[1] + " i " + tablica[2] + " witajcie!";
                }

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


