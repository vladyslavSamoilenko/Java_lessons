package part8_functions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //read source data
        int[] array = {0,1,2,3,4,5,6,7,8,9,10};
        //processing
        reverse(array);
        //display results
        System.out.print(Arrays.toString(array));

    }

    private static void reverse(int[] arr) {
        int len = arr.length ;
        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1];
            arr[len - 1] = temp;
            len--;

        }
    }
}
