package part7_String;

public class StringBuilderUsage {
    public static void main(String[] args) {
        String s = "hello";

        StringBuilder builder = new StringBuilder();
        builder.append("world");
        builder.insert(0,"hello");
        builder.insert(5," ");
        String result = builder.toString();

        System.out.println(result);
    }
}
