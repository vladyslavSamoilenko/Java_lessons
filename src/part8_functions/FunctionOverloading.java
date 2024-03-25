package part8_functions;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println(div(1,3));
        System.out.println(div(2.3,4.5));
    }

    private static int div(int a, int b){
        return a/b;
    }

    private static double div(double a, double b){
        return  a/b;
    }
}
