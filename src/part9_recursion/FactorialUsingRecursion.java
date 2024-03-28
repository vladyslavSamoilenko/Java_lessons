package part9_recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    private static int factorial(int a){
        if (a == 1 || a == 0){
            return 1;
        }
        else {
            return a * factorial(a-1);
        }
    }
}
