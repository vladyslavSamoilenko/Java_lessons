package part4;

import java.util.Scanner;

public class UniversalWeekDay {
    public static void main(String[] args) {

        var DayNumber = 2;
        var isMondayFirst = false;

        var internalDay = DayNumber;
        if(!isMondayFirst){
            internalDay--;
            if (internalDay == 0){
                internalDay = 7;
            }
        }

            if (internalDay == 1) {
                System.out.println("Monday");
            } else if (internalDay == 2) {
                System.out.println("Tuesday");
            } else if (internalDay == 3) {
                System.out.println("Wednesday");
            } else if (internalDay == 4) {
                System.out.println("Thursday");
            } else if (internalDay == 5) {
                System.out.println("Friday");
            } else if (internalDay == 6) {
                System.out.println("Saturday");
            } else if (internalDay == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("Unknown day");
            }


    }
}
