package part8_functions;

public class SumLibrary {
    public static void main(String[] args) {
        System.out.println(sumof(1,5));
    }
    private static short sumof(short a, short b){
        short res=(short)(a+b);
        return res;
    }
    private static int sumof(int a , int b){
        return a+b;
    }
    private static long sumof(long a, long b){
        return a + b;
    }
    private static float sumof(float a, float b){
        return a+b;
    }

    private static double sumof(double a, double b){
        return a + b;
    }
}
