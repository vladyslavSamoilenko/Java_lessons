package part10_practic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        // processing
        int[] numbers = extractNumbersFromString(string);
      // display results
       System.out.println(Arrays.toString(numbers));
    }

    private static int[] extractNumbersFromString(final String string) {
        for(int i = 0; i < string.length(); i++){
        }
        return null;
    }
}
