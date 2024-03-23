package part6_array;

public class ArrayCopy {
    public static void main(String[] args) {

        int startIndex = 2;
        int endIndex = 7;

        int[] source = {2, 3, 4, 5, 6, 7, 8, 5, 3};
        int[] destination = new int[endIndex-startIndex];

        for (int i = 0; startIndex < endIndex; startIndex++) {
             destination[i]=source[startIndex];
             i++;
        }
        for (int i = 0; i < destination.length; i++) {
            System.out.print(destination[i] + " ");
        }
    }
}

