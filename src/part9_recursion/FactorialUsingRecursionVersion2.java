package part9_recursion;

public class FactorialUsingRecursionVersion2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1,5,1));
    }
    private static int factorial(int a){
        if (a == 0){
            return 1;
        } else {
            return a * factorial(a-1);
        }
    }

    private static int factorial(int from, int to,int result){
        if(from > to){
            return result;
        }else {
            return factorial(from + 1, to,result*from);
        }
    }
}
