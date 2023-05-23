import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner("&");

        sj.add("hello ");

        sj.add(" world ");

        sj.add(" welcome to ");

        sj.add(" java ");

        System.out.println(sj);

    }
}