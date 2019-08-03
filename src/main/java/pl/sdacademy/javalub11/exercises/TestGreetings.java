package pl.sdacademy.javalub11.exercises;

public class TestGreetings {

    public static void main(String[] args) {

        Greetings greetings = new Greetings();

        System.out.println(greetings.greet("Adam"));
        System.out.println(greetings.greet(null));
        System.out.println(greetings.greet("WITEK"));
        System.out.println(greetings.greet("Adam,Ela"));


        //System.out.println(greetings.commaCounting("tekst z, przecinkiem jednym, i drugim"));
    }
}
