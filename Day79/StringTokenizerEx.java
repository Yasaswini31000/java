import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("hello@world@welcome@toprogramming@java", "@");

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {

            System.out.println(st.nextToken());
        }

        StringTokenizer str = new StringTokenizer("welcome-to-java-world-...!");

        while(str.hasMoreTokens()) {

            System.out.println(str.nextToken("-"));
        }
    }
}
