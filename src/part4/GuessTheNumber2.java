package Part4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber2 {
    public static void main(String[] args) {
        System.out.print("Enter your Number : ");
        var number = new Scanner(System.in).nextInt();
        var numberGen = new Random().nextInt(10);

        System.out.println(number == numberGen ? "Congratulations, you guessed the number!" : "Sorry, but your number is invalid! Try again later...");
    }
}
