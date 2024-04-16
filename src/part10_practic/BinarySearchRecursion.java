package part10_practic;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,8,9,10};
        System.out.println(binarySearch(array,7, 0,array.length-1));
    }

    private static int binarySearch(int [] array, int number, int start, int end){
        int middle = (start + end) /2;
        int guess = array[middle];
        if (start > end){
            return -1;
        }
        if (guess == number) {
            return middle;
        }else if (guess > number){
            return binarySearch(array,number,start, middle -1);//end = middle - 1;
        } else {
            return binarySearch(array, number, middle + 1, end);
        }
}
}
