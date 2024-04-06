package part10_practic;

public class SimplestTextArchiver {
    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(18) + "B".repeat(8) + "C".repeat(8);
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
                result.append(prev).append(count);
                count=1;
                prev = current;
            }
        }
        result.append(prev).append(count);
        return result.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        char ch = zipped.charAt(0);
        StringBuilder countBuilder = new StringBuilder();
        for (int i = 1; i < zipped.length(); i++){
           var current = zipped.charAt(i);
           if (Character.isDigit(current)){
               countBuilder.append(current);
           }
           else {
               int count = Integer.parseInt(countBuilder.toString());
               for (int j = 0;j<count;j++){
                   result.append(ch);
               }
               countBuilder.setLength(0);
               ch = current;
           }
        }
        int count = Integer.parseInt(countBuilder.toString());
        for (int j = 0;j <count ;j++){
            result.append(ch);
        }
        return result.toString();
    }
}
