package part9_recursion;

public class SumFrom1T100UsingRecursion {
    public static void main(String[] args) {
        System.out.println(sumof(1,0));
        System.out.println(sumof(100));
    }
    private static int sumof(int current, int sum) {
        if (current > 100) {
            return sum;
        } else{
           return sumof(current + 1, sum+current);
        }
    }
    private static int sumof(int value){
        if(value == 0){
            return 0;
        }else {
            return value + sumof(value - 1);
        }
    }
}
