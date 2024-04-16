package part11_decomposition;

import java.util.Arrays;

public class ReturnNerArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNewArray1()));
        System.out.println(Arrays.toString(getNewArray2()));
        System.out.println(Arrays.toString(getNewArray3()));
    }

    private static int[] getNewArray1() {
        int [] arr = {1,2,3};
        return arr;
    }
    private static int[] getNewArray2() {
        int [] arr = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        return arr;
    }
    private static int[] getNewArray3() {
        return new int[]{1,2,3};
    }
}
