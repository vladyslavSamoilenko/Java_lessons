package part6;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8};
        var query = 1;
        
        var index = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == query){
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
