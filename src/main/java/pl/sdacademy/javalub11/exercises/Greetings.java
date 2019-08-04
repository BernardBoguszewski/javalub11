package pl.sdacademy.javalub11.exercises;

public class Greetings {

  public String greet(String name) {
    if (name == null) {
      return "Witaj, mój przyjacielu.";

    } else if (name.contains(",")) {

      String splitName[] = name.split(",");
      if (splitName.length == 2) {
        return splitName[0] + " i " + splitName[1] + ", witajcie!";
      } else if (splitName.length == 3) {
        return splitName[0] + ", " + splitName[1] + " i " + splitName[2] + ", witajcie!";
      }

    } else if (name == name.toUpperCase()) {
      return "WITAJ, " + name + "!";
    } else return "Witaj, " + name;
    return name;
  }
}
