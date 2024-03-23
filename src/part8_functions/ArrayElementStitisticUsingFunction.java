package part8_functions;

public class ArrayElementStitisticUsingFunction {
    public static void main(String[] args) {

        int [] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int [] unique = new int[array.length];
        int [] counts = new int[array.length];
        int count = 0;

        count = CalculateStatistics(array, unique, counts, count);

        int[][] result = ConvertResults(unique, counts, count);

        displayResults(array, result);

    }

    private static void displayResults(int[] array, int[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "=" + ((double) result[i][1] * 100 / array.length) + " %");
        }
    }

    private static int[][] ConvertResults(int[] unique, int[] counts, int count) {
        int [][] result = new int [count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }
        return result;
    }

    private static int CalculateStatistics(int[] array, int[] unique, int[] counts, int count) {
        for(int i = 0; i < array.length ; i++){

            var element = array[i];
            boolean exist = isAlreadyProcessed(unique, count, element);
            if(!exist){
                int number = CalculateElementCount(array, i, element);
                count = AddToResult(unique, counts, count, element, number);
            }
        }
        return count;
    }

    private static boolean isAlreadyProcessed(int[] unique, int count, int element) {
        boolean exist = false;

        for (int j = 0; j < count; j++){
            if(unique[j] == element){
                exist = true;
                break;
            }
        }
        return exist;
    }

    private static int CalculateElementCount(int[] array, int i, int element) {
        var number = 1 ;
        for(int j = i +1; j < array.length; j++){
            if(element == array[j]){
                number++;
            }
        }
        return number;
    }

    private static int AddToResult(int[] unique, int[] counts, int count, int element, int number) {
        unique[count] = element;
        counts[count] = number;
        count++;
        return count;
    }
}
