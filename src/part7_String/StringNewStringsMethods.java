package part7_String;

import java.util.Arrays;

public class StringNewStringsMethods {
    public static void main(String[] args) {
        String s = "Hello world";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.repeat(2));
        System.out.println(s.replace('l','j'));
        System.out.println(s.replace("Hello", "Bye"));

        System.out.println(s.substring(6));
        System.out.println(s.substring(0,6));

        System.out.println(Arrays.toString(s.split(" ")));

        System.out.println(s.trim());
        System.out.println(s.strip());
    }
}
