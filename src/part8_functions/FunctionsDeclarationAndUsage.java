package part8_functions;

public class FunctionsDeclarationAndUsage {
    public static void main(String[] args) {
        int result = sumOf(2,3);
        System.out.println(result);
    }

    private static int sumOf(int a, int b){
        return a + b;
    }
}
