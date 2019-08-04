package pl.sdacademy.javalub11.exercises;

public class StringCalculator {

    public Long add(String digitsToAdd) {
        if(digitsToAdd == null || !digitsToAdd.matches("[\\d\\,]+") || digitsToAdd.isEmpty()){
            return 0L;
        }

        String[] digitsInString = digitsToAdd.split(",");

        Long result = 0L;

        for(String digit: digitsInString){
            result += Long.parseLong(digit);
        }

        return result;
    }
}
