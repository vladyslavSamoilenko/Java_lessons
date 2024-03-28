package part9_recursion;

public class RecursionAlgorithmExampleVersion2 {
    public static void main(String[] args) {
        printNumbersFrom1To(1);
        printNumbersFromAndTo(10);
    }

    private static void printNumbersFrom1To(int i){
        if(i > 10) {
            System.out.println();
        }else {
            System.out.print(i + "\t");
            printNumbersFrom1To(++i);
        }
    }
    private static void printNumbersFromAndTo(int i){
        if(i != 0) {
            printNumbersFromAndTo(i-1);
            System.out.print(i + "\t");
        }
    }
}
