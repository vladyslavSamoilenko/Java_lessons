package part10_practic;

public class FizzBuzz {
    public static void main(String[] args) {
        int i = 1;
        FizzBuzz1();
        FizzBuzz2(i);
    }
    private static void FizzBuzz1 () {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static int FizzBuzz2(int i){
        if (i > 100){
            return i;
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
            return FizzBuzz2(i+1);
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
            return FizzBuzz2(i+1);
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
            return FizzBuzz2(i+1);
        } else {
            System.out.println(i);
            return FizzBuzz2(i +1);
        }
    }

}
