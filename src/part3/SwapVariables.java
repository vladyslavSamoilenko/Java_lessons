package part3;

public class SwapVariables {
    public static void main(String[] args) {
        int first = 2;
        int second = 3;
        int c;
        System.out.println(first);
        System.out.println(second);

        System.out.println();

        c = first;
        first = second;
        second = c;

        System.out.println(first);
        System.out.println(second);

    }
}
