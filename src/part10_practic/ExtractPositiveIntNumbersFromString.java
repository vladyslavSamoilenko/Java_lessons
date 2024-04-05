package part10_practic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        extractNumbersFromString(string);
        // processing
        int[] numbers = extractNumbersFromString(string);
//       display results
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] extractNumbersFromString(final String string) {
        int[] results = new int[string.length() / 2 + 1];
        int count = 0;
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            if (Character.isDigit(ch)) {
                numberBuilder.append(ch);
            } else if (numberBuilder.length() > 0) {
                results[count++] = Integer.parseInt(numberBuilder.toString());
                numberBuilder.setLength(0);
            }
        }
        if (numberBuilder.length() > 0) {
            results[count++] = Integer.parseInt(numberBuilder.toString());
            numberBuilder.setLength(0);
        }
        return trimArray(results, count);
    }
    private static int[] trimArray(int[] array, int count){
        int[] result = new int[count];
        for (int i = 0; i < count; i++){
              result[i]=array[i];
        }
        return result;
    }

}

