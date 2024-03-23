package part4_conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        if (a>b){
            var result = "a > b";
            System.out.println(result);
        }

    }
}
