package part8;

public class ArrayElementsStatisticUsingFunctions {
    public static void main(String[] args) {

        int [] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        int[][] result = calculateStatistic(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "=" + ((double) result[i][1] * 100 / array.length) + " %");
        }

    }

    private static int[][] calculateStatistic(int[] array) {
        int [] unique = new int[array.length];
        int [] counts = new int[array.length];
        int count = 0;

        for(int i = 0; i < array.length ; i++){

            var element = array[i];
            boolean exist = isAlreadyProcess(unique, count, element);

            if(!exist){
                var number = 1 ;
                number = calculateElementCount(array, i, element, number);
                count = AddToResult(unique, counts, count, element, number);
            }
        }

        int[][] result = converteResults(unique, counts, count);
        return result;
    }

    private static boolean isAlreadyProcess(int[] unique, int count, int element) {
        boolean exist = false;

        for (int j = 0; j < count; j++){
            if(unique[j] == element){
                exist = true;
                break;
            }

        }
        return exist;
    }

    private static int calculateElementCount(int[] array, int i, int element, int number) {
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

    private static int[][] converteResults(int[] unique, int[] counts, int count) {
        int [][] result = new int [count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = unique[i];
            result[i][1] = counts[i];
        }
        return result;
    }
}