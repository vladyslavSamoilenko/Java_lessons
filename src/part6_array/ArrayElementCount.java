package part6_array;

public class ArrayElementCount {
    public static void main(String[] args) {
        int [] Array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2,2};
        int number = 2;
        int count = 0;

        for (int i = 0;i < Array.length;i++){
            if (Array[i] == number){
                count++;
            }
        }
        System.out.println(count);
    }
}
