package part9_recursion;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
        var query = -2;

        System.out.println(findIndex(array, 0,query));
    }

    private static int findIndex(int [] array, int i,int query){
        if (i == array.length) {
            return -1;
        }
        if(array[i] == query){
            return i;
        }
        return findIndex(array, i+1,query);
    }
 }
