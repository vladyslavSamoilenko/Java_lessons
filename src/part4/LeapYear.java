package Part4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        var year = new Scanner(System.in).nextInt();

        if(year % 400 == 0){
            System.out.println("Leap year");
        }else if(year % 100 == 0){
            System.out.println("Not leap");
        }else if (year % 4 == 0){
            System.out.println("Leap year");
        } else{
            System.out.println("Not Leap year");
        }
    }
}
