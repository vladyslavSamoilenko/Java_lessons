package part5_cycles;

public class SumFrom1To100 {
    public static void main(String[] args) {
        int to = 100;
        int start = 1;
        int suma = 0;
        for(; start <= to;start++){
            suma += start;
        }
        System.out.println(suma);
    }
}
