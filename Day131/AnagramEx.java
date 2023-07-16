import java.util.Scanner;
public class AnagramEx {

    static boolean isAnagram(String a1, String b1) {

        a1 = a1.toLowerCase();
        b1 = b1.toLowerCase();

        if (a1.length() == b1.length()) {
            int[] a = new int[256];
            int[] b = new int[256];
            for (int i = 0; i < a1.length(); i++) {
                a[(int) a1.charAt(i)] += 1;
                b[(int) b1.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        } else {
            return false;
        }
    }
}