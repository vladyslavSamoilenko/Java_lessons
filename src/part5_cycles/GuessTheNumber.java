package part5_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var numberGen = new Random().nextInt(10);
        for (;;) {
            System.out.print("Enter your Number : ");
            var number = new Scanner(System.in).nextInt();

            if (number == numberGen){
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else if (number > numberGen) {
                System.out.println("number > " + number + " . Try again:");
            } else {
                System.out.println("number < " + number + " . Try again:");
            }
            }
    }
}
