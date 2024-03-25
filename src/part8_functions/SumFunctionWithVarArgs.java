package part8_functions;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        System.out.println(sumof(4,6,12,4));
    }


    private static int sumof(int... args){
        int sum = 0;
        for (int num: args) {
             sum += num;
        }
        return sum;
    }
}
