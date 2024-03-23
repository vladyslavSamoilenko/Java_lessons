package part8_functions;

public class ArrayElementSumUsingFunction{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        int sum = getSum(array);
        System.out.println(sum);
    }

    private static int getSum(int[] array) {
        var sum = 0;
        for(int value: array){
           sum += value;
        }
        return sum;
    }
}
