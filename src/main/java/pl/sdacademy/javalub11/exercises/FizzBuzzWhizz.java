package pl.sdacademy.javalub11.exercises;

public class FizzBuzzWhizz {
    public String fizzBuzzWhizz(int digit) {

        StringBuilder result = new StringBuilder();

        if (digit == 0) {
            return "Nie dla zer!";
        }

        if (digit % 3 == 0) {
            result.append("Fizz");
        }

        if (digit % 5 == 0) {
            result.append("Buzz");
        }

        return result.toString();
    }
}
