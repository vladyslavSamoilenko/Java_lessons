package part10_practic;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {5,1,4,2,8,3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int [] bubbleSort(int [] array){
        int j = 1;
        int len = array.length;
        for (int i = 0; i < len-1;i++){
            if (array[i] > array[j]){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }else if (array[i] < array[j]){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i--;
            }

        }
        return array;
    }
}
