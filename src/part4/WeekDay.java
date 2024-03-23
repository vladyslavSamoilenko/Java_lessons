package part4;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        System.out.print("Enter day number: ");
        var DayNumber = new Scanner(System.in).nextInt();

        if (DayNumber == 1){
            System.out.println("Monday");
        } else if (DayNumber == 2) {
            System.out.println("Tuesday");
        }else if (DayNumber == 3) {
            System.out.println("Wednesday");
        }else if (DayNumber == 4) {
            System.out.println("Thursday");
        }else if (DayNumber == 5) {
            System.out.println("Friday");
        }else if (DayNumber == 6) {
            System.out.println("Saturday");
        }else if (DayNumber == 7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Unknown day");
        }

    }
}
