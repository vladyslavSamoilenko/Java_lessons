package part7;

public class BigIntegerSum {
    public static void main(String[] args) {
        String a = "123456789012345678901234567890123456789012345678901234567890";
        String b = "12345678901234567890123456789012345678901234567890";

        var a1= a.length() >= b.length() ? a : "0".repeat(b.length()-a.length()) + a;
        var b1= b.length() >= a.length() ? b : "0".repeat(a.length()-b.length()) + b;

        StringBuilder res = new StringBuilder();
        int prevDigit = 0;
        for (int i = a.length() - 1; i >= 0; i--){
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int suma = digit1 + digit2 + prevDigit;
            if(suma > 9){
               prevDigit = 1;
               suma = suma %10;
            }else {
                prevDigit = 0;
            }
            res.insert(0,suma);
        }
        if(prevDigit != 0){
            res.insert(0,prevDigit);
        }


        System.out.println(res.toString());



    }
}
