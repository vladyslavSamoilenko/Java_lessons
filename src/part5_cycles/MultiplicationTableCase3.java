package part5_cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                if(j == 6){
                    break;
                }
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i < 10; i++) {
            for (int j = 6; j < 10; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}











//    public static void main(String[] args) {
//        for (int i = 2; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.print(j + " * " + i + "= " + i * 1 * j + "\t");
//            }
//            System.out.println();
//        }
//    }