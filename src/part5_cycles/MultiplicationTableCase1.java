package part5_cycles;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = i * 1 * j;
                System.out.print((result == 1 ? "" : result) + "\t");
            }
            System.out.println();
        }
    }
}
