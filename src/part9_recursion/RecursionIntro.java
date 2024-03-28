package part9_recursion;

public class RecursionIntro {
    public static void main(String[] args) {
        function1(10);
    }
    private static void function1(int count){
        if(count > 0){
            System.out.print(count + " ");
        function1(count - 1);
        }
    }
}
