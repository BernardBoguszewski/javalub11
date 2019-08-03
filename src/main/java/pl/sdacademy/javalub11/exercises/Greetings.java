package pl.sdacademy.javalub11.exercises;

public class Greetings {

  /* TODO should throw exception */
  private boolean isUpper(String name) {
    if (name == null) return false;
    return name.equals(name.toUpperCase());
  }

  public int countUpper(String name) {
    int result = 0;

    String[] names = name.split("\\,");

    for (String s : names) {
      if (isUpper(s)) result++;
    }

    return result;
  }

    public boolean isDigitInString(String name)
    {
        for (int i = 0; i < name.length(); i++) {
            if(Character.isDigit(name.charAt(i)))
                return true;
        }
        return false;
    }

    private String addSeparator(int index, int amount)
    {
        if (index == (amount - 1)) {
            return  " i ";
        } else {
            return  ", ";
        }
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

      String trimedString = s.trim();

      if (isUpper(s)) {

        if (indexRight > 0) {
          resultRight += addSeparator(indexRight, namesRightAmount);
        }

        resultRight += trimedString;
        indexRight++;

      } else {

        if (indexLeft > 0) {
            resultLeft += addSeparator(indexLeft, namesLeftAmount);
        }

        resultLeft += trimedString;
        indexLeft++;

      }
    }

    if (resultLeft.length() > 0) {
      if (indexLeft > 1) {
        resultLeft += ", witajcie!";
      } else {
        resultLeft = "Witaj, " + resultLeft;
      }
    }

    /* Proper prefix (for right part) not defined in requirement list */
    if (resultRight.length() > 0) {
      if (indexRight > 1) {
        resultRight = "WITAJCIE " + resultRight + "!";
      } else {
        resultRight = "WITAJ " + resultRight + "!";
      }
    }

    /* Just when we have two strings occurrence we should add seperator (space) between them */
    String separator = "";
    if ((resultLeft.length() > 0) && (resultRight.length() > 0)) separator = " ";

    return resultLeft + separator + resultRight;
  }

  public String greet(String name) {
    if (name == null)
        return "Witaj, mój przyjacielu";

    if(isDigitInString(name))
        return "Z liczbami sie nie witam.";

    return processNames(name);
  }
}
