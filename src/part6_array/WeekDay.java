package part6_array;

public class WeekDay {
    public static void main(String[] args) {
        var day = 5;
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        var result = day >= 1 && day <= 7 ? week[day-1] : "Invalid day";

        System.out.println(result);
    }
}
