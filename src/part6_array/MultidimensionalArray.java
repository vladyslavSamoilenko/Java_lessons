package part6_array;
import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] array1 = new int[3][4];
        int [][] array2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(array2[2][3]);
        for (int[] row: array2) {
            System.out.println(Arrays.toString(row));
        }
    }
}
