package part7_String;

public class StringVerificationMethods {
    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println("s.contains(\"World\") = " + s.contains("World"));
        System.out.println("s.contains(\"world\") = " + s.contains("world"));

        System.out.println(s.indexOf('o'));
        System.out.println(s.lastIndexOf('o'));
    }
}
