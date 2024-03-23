package part6_array;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int [] Array = {10, 5, 8, 0, 5,21};
        int min = Array[0];
        int max = Array[0];

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < Array.length;i++){
            if(Array[i] < min){
                min = i;
            }
        }
        for(int j = 0; j < Array.length;j++){
            if(Array[j] > max){
                max = j;
            }
        }

        int temp = Array[min];
        Array[min] = Array[max];
        Array[max] = temp;


        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
