package pl.sdacademy.javalub11.exercises;

import org.apache.commons.math3.primes.Primes;

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

    public String isPrime(int digit) {

        String result = "";

        if(digit == 0){
            result = "Nie dla zer!";
            return result;
        }

        if(Primes.isPrime(digit)){
            if(digit == 3) {
                result = "FizzWhizz";
                return result;
            }
            if(digit == 5){
                result = "BuzzWhizz";
                return result;
            }
            result = "Whizz";
            return result;
        }
        return result;
    }
}
