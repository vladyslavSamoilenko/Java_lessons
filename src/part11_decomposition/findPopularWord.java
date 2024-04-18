package part11_decomposition;

import java.util.Arrays;
import java.util.Objects;

public class findPopularWord {
    public static void main(String[] args) {
        String text = "hello java world java hello I Hello Java World java";
        System.out.println(MostPopularWord(text));
    }

    private static String MostPopularWord(String text) {
        StringBuilder str = new StringBuilder();
        char [] ArrChar = text.toLowerCase().toCharArray();
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

            if (ArrChar[i] != ' '){
                str.append(ArrChar[i]);
            } else {
                String StringConverted = str.toString();
                fullArray[index++] = StringConverted;
                str.delete(0, str.length());
                count++;
            }
            if(i == ArrChar.length-1){
                String StringConverted = str.toString();
                fullArray[index++] = StringConverted;
                str.delete(0, str.length());
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
