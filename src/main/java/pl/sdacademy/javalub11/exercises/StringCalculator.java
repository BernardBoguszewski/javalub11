package pl.sdacademy.javalub11.exercises;

import java.util.regex.Pattern;

public class StringCalculator {

    public Long add(String digitsToAdd) {

        if (digitsToAdd == null || (( !digitsToAdd.matches("[\\d\\,[\\\n]]+") || digitsToAdd.isEmpty()) && !existsCorrectDelimiter(digitsToAdd))) {
            return 0L;
        }

        Long result = 0L;
        String delimiter = ",|\n";
        String data = digitsToAdd;

        if (existsCorrectDelimiter(digitsToAdd)) {
            String[] arrayWithSplitedDelimiterAndData = digitsToAdd.split("\n");

            data = arrayWithSplitedDelimiterAndData[1];
            String stringWithDelimiter = arrayWithSplitedDelimiterAndData[0];

            delimiter = Pattern.quote(extractDelimiter(stringWithDelimiter));

        } else {
            delimiter = ",|\n";
        }

            String[] digitsInStringArray = data.split(delimiter);

            result = 0L;

            for (String digit : digitsInStringArray) {
                result += Long.parseLong(digit);
            }

        return result;
    }

    private String extractDelimiter(String stringWithDelimiter) {

        char[] charsArrayWithSplittedDelimiterString = stringWithDelimiter.toCharArray();

        StringBuilder delimiter = new StringBuilder();

        if (charsArrayWithSplittedDelimiterString[0] == '/' && charsArrayWithSplittedDelimiterString[1] == '/') {
            delimiter.append(charsArrayWithSplittedDelimiterString[2]);
            return delimiter.toString();
        }
        return ",|\n";
    }

    private boolean existsCorrectDelimiter(String inputData) {

        if (!inputData.contains("\n")) {
            return false;
        }

        String[] arrayWithSplitedDelimiterAndData = inputData.split("\n");

        if (!(arrayWithSplitedDelimiterAndData.length > 1 && arrayWithSplitedDelimiterAndData[0].length() >= 3)) {
            return false;
        }

        String delimiter = extractDelimiter(arrayWithSplitedDelimiterAndData[0]);
        String data = arrayWithSplitedDelimiterAndData[1];

        String regexpAcceptDigitsAndExtractedDelimiter = "[\\d|" + delimiter + "]*";

        return data.matches(regexpAcceptDigitsAndExtractedDelimiter);
    }
}
