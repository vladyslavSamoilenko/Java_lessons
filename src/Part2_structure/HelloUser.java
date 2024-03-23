package Part2_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Hello, whats your name : ");
        var name = new Scanner(System.in).nextLine();
        System.out.println("Hello " + name);
    }
}
