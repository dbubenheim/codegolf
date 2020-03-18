package codesignal;

import java.util.Arrays;

public class SrtSrt {


    static int strstr(String s, String x) {

        if (s == null || s.length() == 0) return -1;
        int length = x.length();
        if (x == null || length == 0) return -1;

        var firstX = x.charAt(0);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char sc = chars[i];
            //System.out.println("sc " + sc);
            if (sc == firstX) {
                int z = i + length;
                if (s.length() >= z && s.substring(i, z).equals(x)) {
                    //System.out.println("i " + i);
                    return i;
                } else {
                    i += length - 2;
                    //System.out.println("else i " + i);
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {


    }
}
