package part9_recursion;

public class FindMinElementUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0,-8, 5,-10,-3};
        int firstElement = array[0];
        System.out.println(findMin(array, 0,firstElement));
    }

    private static int findMin(int [] array, int i,int firstElement){
        if (i >= array.length){
            return firstElement;
        }
        if(array[i] < firstElement) {
            firstElement = array[i];
        }
        return findMin(array, i + 1,firstElement);
        }
    }
