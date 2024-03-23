package part6_array;

public class ArrayElementsSum {
    public static void main(String[] args) {
        int [] Array = {2,2};
        int suma = 0;

        for (int i = 0 ; i < Array.length;i++){
            suma += Array[i];
        }

        System.out.println(suma);

    }
}
