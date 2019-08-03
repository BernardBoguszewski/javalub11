package pl.sdacademy.javalub11.exercises;

public class Greetings {

  /* TODO should throw exception */
  private boolean isUpper(String name) {
    if (name == null) return false;
    return name.equals(name.toUpperCase());
  }

  public int countUpper(String name)
  {
    int result = 0;

    String[] names = name.split("\\,");

    for (String s : names) {
      if (isUpper(s)) result++;
    }

    return result;
  }

  private String processNames(String name) {
    String resultLeft = "";
    String resultRight = "";

    String[] names = name.split("\\,");

    int namesAmount = names.length;
    int namesRightAmount = countUpper(name);
    int namesLeftAmount = namesAmount - namesRightAmount;
    int indexLeft = 0;
    int indexRight = 0;

    for (String s : names) {

      if (isUpper(s)) {
        if (indexRight > 0) {
          if (indexRight == (namesRightAmount - 1)) {
            resultRight += " i ";
          } else {
            resultRight += ", ";
          }
        }
        resultRight += s.trim();
        indexRight++;

      } else {

        if (indexLeft > 0) {
          if (indexLeft == (namesLeftAmount - 1)) {
            resultLeft += " i ";
          } else {
            resultLeft += ", ";
          }
        }
        resultLeft += s.trim();

        indexLeft++;
      }
    }

    //System.out.println("In test: left='" + resultLeft + "' right='" + resultRight + "'");

    if (resultLeft.length() > 0)
    {
      if (indexLeft > 1) {
        resultLeft += ", witajcie!";
      }else{
        resultLeft = "Witaj, " + resultLeft;
      }
    }

    if (resultRight.length() > 0)
    {
      if (indexRight > 1)
      {
        resultRight = "WITAJCIE " + resultRight + "!";
      } else {
        resultRight = "WITAJ " + resultRight + "!";
      }
    }

    String separator = "";
    if((resultLeft.length() > 0) && (resultRight.length() > 0))
      separator = " ";

    return resultLeft + separator + resultRight;
  }

  public String greet(String name) {
    String result = "Witaj, mój przyjacielu";

    if (name == null) return result;

    result = processNames(name);
    return result;
  }
}
