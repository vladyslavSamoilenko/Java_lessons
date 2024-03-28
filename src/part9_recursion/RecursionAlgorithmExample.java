package part9_recursion;

public class RecursionAlgorithmExample {
    public static void main(String[] args) {
        printNumbersFrom1To(1);
    }

    private static void printNumbersFrom1To(int i){
        if(i > 10) {
            System.out.println();
        }else {
            System.out.print(i + "\t");
            printNumbersFrom1To(++i);
        }
    }
}
