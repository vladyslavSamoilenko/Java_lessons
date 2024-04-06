package part10_practic;

import Part2_structure.In;

public class SimpleTextArchiveVersion2 {
    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(18) + "1".repeat(13) + "2".repeat(25);
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
        int quotient = count/9;
        int remainder = count % 9;
        for (int i = 0; i < quotient;i++){
            result.append(prev).append(9);
        }
        if (remainder != 0) {
            result.append(prev).append(remainder);
        }
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zipped.length(); i=i+2){
            var current = zipped.charAt(i);
            int count = Integer.parseInt(String.valueOf(zipped.charAt(i+1)));
            for(int j = 0; j < count;j++){
                    result.append(current);
            }
        }
        return result.toString();
    }

}
