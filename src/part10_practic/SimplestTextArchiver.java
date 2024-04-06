package part10_practic;

public class SimplestTextArchiver {
    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
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
        StringBuilder str_ch = new StringBuilder();
        int count = 1;
        for(int i = 0; i < source.length();i++){
            var temp_char = source.charAt(i);
            if ( i + 1 == source.length()){
                str_ch.append(temp_char);
                str_ch.append(count);
                count=1;
            } else if (temp_char == source.charAt(i+1)) {
                count++;
            }else {
                str_ch.append(temp_char);
                str_ch.append(count);
                count=1;
            }
        }
        return str_ch.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder str_ch = new StringBuilder();
        for (int i = 0; i < zipped.length(); i = i + 2){
           var temp_char1 = zipped.charAt(i);
           char temp_char2 = zipped.charAt(i + 1);
           int count = Character.getNumericValue(temp_char2);
           str_ch.append(String.valueOf(temp_char1).repeat(Math.max(0, count)));
        }

        return str_ch.toString();
    }
}
