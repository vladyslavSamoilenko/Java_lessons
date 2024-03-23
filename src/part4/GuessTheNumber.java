package Part4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.print("Enter your Number : ");
        var number = new Scanner(System.in).nextInt();
        var numberGen = new Random().nextInt(10);

        if (number == numberGen){
            System.out.println("Congratulations, you guessed the number!");
        }else{
            System.out.print("Sorry, but your number is invalid! Try again later...");
        }
    }
}
