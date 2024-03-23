package part4;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        var a = new Scanner(System.in).nextInt();
        System.out.print("Enter b: ");
        var b = new Scanner(System.in).nextInt();
        System.out.print("Enter operator: ");
        var operator = new Scanner(System.in).nextLine().charAt(0);


        String result = null;
        if (operator == '+'){
            result = "a + b = " + (a + b);
        }else if(operator == '-'){
            result = "a - b = " + (a - b);
        }else if (operator == '*'){
            result = "a * b = " + (a * b);
        }else if (operator == '/'){
            result = "a / b = " + (a / b);
        } else if (operator == '%'){
            result = "a % b = " + (a % b);
        }else{
            System.out.println("Unsupported operator");
        }

        System.out.println(result);
    }
}
