package part6;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] Array = {1,2,3,4,5};

        for (int i = 0; i < Array.length /2; i++){
            int temp = Array[i];
            Array[i] = Array[Array.length-i-1];
            Array[Array.length-i-1] = temp;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
