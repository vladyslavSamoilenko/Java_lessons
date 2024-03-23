package part7;

public class StringvsCharArray {
    public static void main(String[] args) {
        char [] array = {'h','e','l','l','o'};
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        //-------------
        String s1 = "hello";
        for (int i = 0; i < s1.length(); i++){
            System.out.print(s1.charAt(i));
        }
        System.out.println();

    }
}
