package pl.sdacademy.javalub11.exercises;

public class SquareBrackets {

    public boolean isClosed(String brackets) {

        if (brackets == null) {
            return false;
        }

        if(!brackets.matches("[\\[\\]]+")){
            return false;
        }

        char[] bracketsArray = brackets.toCharArray();

        int balanceBetweenBrackets = 0;

        for (int i = 0; i < bracketsArray.length; i++) {
            if (bracketsArray[i] == '[') {
                ++balanceBetweenBrackets;
            } else {
                --balanceBetweenBrackets;
            }

            if (balanceBetweenBrackets < 0) {
                return false;
            }

            if (i == bracketsArray.length - 1 && balanceBetweenBrackets > 0) {
                return false;
            }
        }
        return true;
    }
}
