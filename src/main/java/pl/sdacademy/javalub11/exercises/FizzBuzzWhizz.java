package pl.sdacademy.javalub11.exercises;

public class FizzBuzzWhizz {
    public String fizzBuzzWhizz(int digit) {

        StringBuilder result = new StringBuilder();

        if (digit == 0) {
            result.append("Nie dla zer!");
        }

        return result.toString();
    }
}
