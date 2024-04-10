package part10_practic;

public class SimpleTextArchiveVersion3 {
    public static String digits = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ~!@#$%^&*/()_+=-?<>[]{}\\\"'\\\\|.,";
    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(110) + "1".repeat(130) + "2".repeat(250);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder result = new StringBuilder();
        var prev = source.charAt(0);
        int count = 1;
        for(int i = 1; i < source.length();i++){
            var current = source.charAt(i);
            if (current == prev) {
                count++;
            }else {
                zipChar(result, prev, count);
                count=1;
                prev = current;
            }
        }
        zipChar(result, prev, count);
        return result.toString();
    }

    private static void zipChar(StringBuilder result, char prev, int count) {
        int quotient = count/digits.length();
        int remainder = count % digits.length();
        for (int i = 0; i < quotient;i++){
            result.append(prev).append(digits.charAt(digits.length()-1));
        }
        if (remainder != 0) {
            result.append(prev).append(digits.charAt(remainder-1));
        }
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zipped.length(); i=i+2){
            var current = zipped.charAt(i);
            int count = digits.indexOf(zipped.charAt(i+1))+1;
            for(int j = 0; j < count;j++){
                result.append(current);
            }
        }
        return result.toString();
    }
}
