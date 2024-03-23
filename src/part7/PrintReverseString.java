package part7;

public class PrintReverseString {
    public static void main(String[] args) {

        var s = "Hello World";
        var change = s.toCharArray();
        var lastindex = s.indexOf(change[change.length -1]);

        for (int i = s.length()-1; i >= 0 ; i-- ){
            System.out.print(s.charAt(i));
        }

    }
}
