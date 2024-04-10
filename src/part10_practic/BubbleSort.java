package part10_practic;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {1,2,3,9,0,6,8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static int [] bubbleSort(int [] array){
        for (int j = 1; j < array.length; j++){
            boolean swap = false;
            for (int i = 0 ;i < array.length - j ; i++ ){
               if (array[i]>array[i+1]){
                   int temp = array[i];
                   array[i] = array[i+1];
                   array[i + 1] = temp;
                   swap = true;
               }
        }
            if (!swap){
                break;
            }
        }
        return array;
    }
}
