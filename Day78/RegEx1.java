import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("Rock");

        Matcher m = p.matcher("rock");

        System.out.println(m.matches());

        Matcher m1 = p.matcher("Rock1");

        System.out.println(m1.matches());
    }
}


