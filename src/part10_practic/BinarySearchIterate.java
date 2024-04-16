package part10_practic;

public class BinarySearchIterate {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(array,31));
    }

    private static int binarySearch(int [] array, int number){
        int start = 0;
        int end = array.length-1;
        while (start <= end) {
            int middle = (start + end) /2;
            int guess = array[middle];
            if (guess == number) {
                return middle;
            } else if (guess < number) {
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        return -1;
    }
}
