package part6_array;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int [] array = {1,5,2,1,2,1,0,4};


        for (int i = 0; i < array.length; i++) {
            if(array[i]<0) {
                System.out.println("Not all positive");
                break;
            }
            if(i == array.length-1 && array[i]>=0){
                System.out.println("All positives");
            }
        }

    }
}
