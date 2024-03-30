package part10_practic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";

        // processing
        //int[] numbers = extractNumbersFromString(string);
//      // display results
//       System.out.println(Arrays.toString(numbers));
    }

    private static int[] extractNumbersFromString(final String string) {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < string.length(); i++){
            char ch = string.charAt(i);
            if(Character.isDigit(ch)){
                str.append(ch);
            }else {
                if(str.length() > 0){
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            System.out.println("Найдено число: " + str);
        }
        return null;
    }
}
