package Part2;

import java.io.File;

public class Mkdir {
    public static void main(String[] args) {
        new File(args[0]).mkdir();
    }
}
