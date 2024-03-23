package part5_cycles;

public class Factorial {
    public static void main(String[] args) {
        int number = 32;
        int fact = 1;
        int i = 1;
        for (;;){
            if(number == 0){
                fact = 1;
                System.out.println(number + "! = " + 1);
                break;
            } else if (number < 0) {
                System.out.println("Value should be >=0");
                break;
            } else if (number > Integer.MAX_VALUE) {
                System.out.println("Int overflow");
                break;
            }else{
                if(i == number + 1 ){
                    System.out.println(fact);
                    break;
                }
                fact=fact*i;
                i++;
            }
        }
        System.out.println(Integer.MAX_VALUE);
    }
}
