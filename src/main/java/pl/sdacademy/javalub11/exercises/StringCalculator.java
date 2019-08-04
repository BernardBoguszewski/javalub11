package pl.sdacademy.javalub11.exercises;

public class StringCalculator {

    public int strToInt(String expression)
    {
        return Integer.valueOf(expression) % 1000;
    }

    public String findSeparator(String expression)
    {
        String separator = "";
        boolean separatorFound;

        String[] parts = expression.split("\\" + "\n");
        String[] elements = parts[0].split("\\" + "//");

        if(elements.length > 1)
        {
            return elements[1];
        }

        return "";
    }

    public int stringCalculateVer1(String expresson) throws ArithmeticException
    {
        int result = 0;
        String separator;

        if((expresson == null) || (expresson.equals("")))
            return result;

        String secondPhase;

        separator = findSeparator(expresson);

        if(separator != "")
        {
            secondPhase = expresson;
            secondPhase = secondPhase.replace("\n","");
            secondPhase = secondPhase.replace("//","");
        } else
        {
            secondPhase = expresson.replace("\n",",");
            separator = ",";
        }

        String[] parts = secondPhase.split("\\" + separator);

        int converted = 0;

        for (String s : parts) {
            if(!s.equals(""))
            converted = strToInt(s);
            if(converted < 0)
                throw new ArithmeticException("Liczby ujemne nie sa obsługowanie");

            result += converted;
        }

        return result;
    }

    public int stringCalculateVer2(String expresson)
    {
        int result = 0;

        if((expresson == null) || (expresson.equals("")))
            return result;

        char[] stringToCharArray = expresson.toCharArray();

        for (char ch : stringToCharArray) {
            //System.out.println(output);

            switch (ch)
            {
                case ',':
                {
                    break;
                }
            }



        }


        return result;

    }
}
