package Part2;

public class Var {
    public static void main(String[] args) {
        var text = "Hello world";
        System.out.println(text);

        text = "I love Java";
        System.out.println(text);

        text = "Hello " + System.getProperty("user.name");
        System.out.println(text);
    }
}
