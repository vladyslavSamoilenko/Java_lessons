package part7;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            String enter = new Scanner(System.in).nextLine();
            if (enter.equals("pi")) {
                System.out.println(Math.PI);
            }
            else if (enter.equals("e")) {
                System.out.println(Math.E);
            }
            else if (enter.equals("exit") || enter.equals("quit")) {
                break;
            }
            else {
                System.out.println("Invalid cmd! Try again!");
            }
        }
    }
}
