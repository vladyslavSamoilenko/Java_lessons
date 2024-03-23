package part7_String;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");
        String res = str.reverse().toString();
        System.out.println(res);


    }
}
