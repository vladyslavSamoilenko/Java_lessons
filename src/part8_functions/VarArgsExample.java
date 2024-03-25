package part8_functions;

public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println(concat());
        System.out.println(concat("Hello"));
        System.out.println(concat("hello","World"));
    }
    private static String concat(String... args){
        StringBuilder builder = new StringBuilder();
        for (String arg: args){
            builder.append(arg);
        }
        return builder.toString();
    }
}
