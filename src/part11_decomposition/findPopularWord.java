package part11_decomposition;

import java.util.Arrays;
import java.util.Objects;

public class findPopularWord {
    public static void main(String[] args) {
        String text = "hello,java-world\tjava hello: I? Hello! Java World. java";
        char [] textChar = text.toCharArray();
        System.out.println(Arrays.toString(textChar));
        System.out.println(MostPopularWord(text));
    }



    private static String MostPopularWord(String text) {
        StringBuilder str = new StringBuilder();
        char [] ArrChar = text.toLowerCase().toCharArray();
        System.out.println(Arrays.toString(ArrChar));
        String [] fullArray = new String[text.length()/2];
        String [] WordArray = extractWords(str,ArrChar,fullArray);
        String [] unique = extractUniqueWords(WordArray);
        return findThePopularWord(unique,WordArray);

    }
    private static String findThePopularWord(String [] ArrUnique, String [] ArrAllWords){
        String popularWord = ArrUnique[0];
        int count = 1;
        for (int i = 0; i < ArrUnique.length;i++){
            int countTemp = 0;
            for (int j = 0;j< ArrAllWords.length; j++){
                if (Objects.equals(ArrUnique[i], ArrAllWords[j])){
                    countTemp++;
                }
            }
            if (countTemp > count){
                popularWord = ArrUnique[i];
                count = countTemp;
            }
        }
        return popularWord;
    }

    private static String[] extractUniqueWords(String [] WordArray) {
        String [] uniqueElements = new String[WordArray.length];
        int index = 0;
        int count = 0;
        for(int i = 0; i < WordArray.length;i++){
            if (Arrays.asList(uniqueElements).contains(WordArray[i])){
                continue;
            }else {
                uniqueElements[index++] = WordArray[i];
                count++;
            }
        }
        return trim(uniqueElements,count);
    }

    private static String [] extractWords(StringBuilder str, char[] ArrChar, String[] fullArray) {
        int index = 0;
        int count = 0;
        for (int i = 0; i< ArrChar.length; i++){

            if (Character.isLetter(ArrChar[i]) || Character.isDigit(ArrChar[i])){
                str.append(ArrChar[i]);
            } else if(str.length() > 0){
                String StringConverted = str.toString();
                fullArray[index++] = StringConverted;
                str.setLength(0);
                count++;
            }
            if(i == ArrChar.length-1){
                String StringConverted = str.toString();
                fullArray[index++] = StringConverted;
                str.setLength(0);
                count++;
            }

        }
        return trim(fullArray, count);
    }

    private static String [] trim(String [] array, int count){
        String  [] result = new String[count];
        System.arraycopy(array, 0, result, 0, count);
        return result;

    }
}
