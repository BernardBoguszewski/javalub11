package pl.sdacademy.javalub11.exercises;

public class TestGreetings {

    public static void main(String[] args) {

        Greetings greetings = new Greetings();

        System.out.println(greetings.greet("Adam"));
        System.out.println(greetings.greet(null));
    }
}
