package pl.sdacademy.javalub11.exercises;

public class SquareBrackets {

    public boolean isClosed(String brackets) {

        if (brackets == null) {
            return false;
        }

        if (!brackets.matches("[\\[\\]]+")) {
            return false;
        }

        return !bracketsIsOpened(brackets);
    }

    private boolean bracketsIsOpened(String brackets) {
        char[] bracketsArray = brackets.toCharArray();

        int balanceBetweenBrackets = 0;

        for (int i = 0; i < bracketsArray.length; i++) {
            if (bracketsArray[i] == '[') {
                ++balanceBetweenBrackets;
            } else {
                --balanceBetweenBrackets;
            }

            if (balanceBetweenBrackets < 0) {
                return true;
            }

            if (i == bracketsArray.length - 1 && balanceBetweenBrackets > 0) {
                return true;
            }
        }
        return false;
    }
}
