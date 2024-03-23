package part6_array;

public class FindMinElement {
    public static void main(String[] args) {
        int [] Array = {10, 5, 8, 0, 5};
        int min = Array[0];

        for(int i = 0; i < Array.length;i++){
            if(Array[i] < min){
                min = Array[i];
            }
        }

        System.out.println(min);
    }
}
