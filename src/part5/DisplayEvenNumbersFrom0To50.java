package part5;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        int number = 0;

        do{
            if(number % 2 == 0){
                System.out.println(number);
            }
            number++;
            }while(number <= 50);
        }

}
