package part9_recursion;

import part5_cycles.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursion {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        GuessTheNumber( number);
        }

        private static void GuessTheNumber( int number){
            System.out.print("Print your number: ");
            var userCase = new Scanner(System.in).nextInt();
            if( number > userCase){
                System.out.println("number > " + userCase + ". Try again:");
                GuessTheNumber(number);
            } else if (number < userCase) {
                System.out.println("number < " + userCase + ". Try again:");
                GuessTheNumber(number);
            }else {
                System.out.println("Congratulations, you guessed the number!");
            }

        }
    }

