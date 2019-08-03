package pl.sdacademy.javalub11.exercises;

public class Greetings {

  public String greet(String name) {
    boolean isMultipleNames = false;

    String result = "Witaj, mój przyjacielu";

    if (name == null) return result;

    if (name.contains(",")) isMultipleNames = true;

    if (isMultipleNames) {
      String[] names = name.split("\\,");

      int namesAmount = names.length;

      // Adam i Iza, witajcie!
      result = "";
      int index = 0;

      for (String s : names) {

        if (index > 0) {
            //dla ostatniego dodajem i w przeciwnym wypadku tylko przecinek
          if (index == (namesAmount - 1)) {
            result += " i ";
          } else {
            result += ", ";
          }
        }
        result += s;

        index++;
      }

      result += ", witajcie!";



    } else {
      String upperCase = name.toUpperCase();
      if (name.equals(upperCase)) {
        result = "WITAJ, " + upperCase + "!";
      } else {
        result = "Witaj, " + name;
      }
    }
    return result;
  }
}
