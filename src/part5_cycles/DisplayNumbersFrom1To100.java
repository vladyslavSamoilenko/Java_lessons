package part5_cycles;

public class DisplayNumbersFrom1To100 {
    public static void main(String[] args) {
        int from = 1;
        int to = 100;
        int cols = 10;

        for (int i = from; i<= to; i++){
            System.out.print(i + "\t");
            if(i % cols == 0){
                System.out.println();
            }
        }
    }
}
