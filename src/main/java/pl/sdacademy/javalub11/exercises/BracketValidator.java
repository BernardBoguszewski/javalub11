package pl.sdacademy.javalub11.exercises;

public class BracketValidator {

  public boolean validator(String name) {
    boolean result = false;
    int opening = 0;

    for (int index = 0; index < name.length(); index++) {

        switch (name.charAt(index)) {
        case '[':
          opening++;
          break;

        case ']':
          opening--;
          break;
      }

      /* we have more closing brackets whan opening, so exit */
      if (opening < 0) break;
    }

    return (opening == 0);
  }
}
