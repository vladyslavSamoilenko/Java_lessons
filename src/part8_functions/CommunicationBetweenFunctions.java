package part8_functions;

public class CommunicationBetweenFunctions {
    public static void main(String[] args) {
       int[] a = {9};
       function1(a);
        System.out.println(a[0]);
    }
    private static void function1(int[] a){
        a[0]++;
        System.out.println(a[0]);
    }
}
