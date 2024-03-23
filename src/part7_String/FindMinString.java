package part7_String;

public class FindMinString {
    public static void main(String[] args) {

        String [] s1 = {"one", "two", "three", "four", "five"};

        String min = s1[0];

        for (int j = 1; j < s1.length; j++){
            if (s1[j].compareTo(min) < 0) {
                    min = s1[j];
            }
        }
        System.out.println(min);
    }
}
