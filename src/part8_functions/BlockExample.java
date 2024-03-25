package part8_functions;

public class BlockExample {
    public static void main(String[] args) {
        int a = 0;
        {
            int b = 0;
            System.out.println(b);
            {
                int c = 4;
                System.out.println(c);
            }
        }
    }
}
