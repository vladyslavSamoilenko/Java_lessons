package part11_decomposition;

import java.util.Arrays;

public class PrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 12,8,16};
        int [] result = ArrayElementsMoreThanAvg(array);
        System.out.println(Arrays.toString(result));
    }

    private static int [] ArrayElementsMoreThanAvg(int[] array) {
        double average = getAverage(array);
        return addToNewArray(array, average);
    }

    private static int getAverage(int[] array) {
        int avgSum = 0;
        for (int j : array) {
            avgSum += j;
        }
        return (int) Math.round((double) avgSum / array.length);
    }

    private static int[] addToNewArray(int[] array, double average) {
        int [] arrayGreatsAvg = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > average){
                arrayGreatsAvg[count++] = array[i];
            }
        }
        return trim(arrayGreatsAvg, count);
    }
    private static int [] trim(int [] array, int count){
        int [] result = new int[count];
        System.arraycopy(array, 0, result, 0, count);
        return result;

    }
}
