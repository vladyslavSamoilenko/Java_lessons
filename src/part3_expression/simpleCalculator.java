package part3_expression;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        System.out.print("Write a number : ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Write b number : ");
        int b = new Scanner(System.in).nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

}
