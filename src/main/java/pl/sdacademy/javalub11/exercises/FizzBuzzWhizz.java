package pl.sdacademy.javalub11.exercises;

public class FizzBuzzWhizz {

  private boolean isPrimary(int value) {
    boolean isPrime = true;

    if (value == 1) return false;

    for (int index = value - 1; ((index > 2) && (isPrime)); index--) {
      if (value % index == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }

  public String fizzBuzzWhizz(int digit) {
    String result = "Nie dla zer!";
    if (digit > 0) {
      result = "";
      if (digit % 3 == 0) result = "Fizz";
      if (digit % 5 == 0) result += "Buzz";
      if (isPrimary(digit)) result += "Whizz";
    }
    return result;
  }
}
