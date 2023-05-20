import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumMatch {
    public static void  main(String[] args) {

        Pattern p1 = Pattern.compile("..........");

        Scanner sc = new Scanner(System.in);

        Matcher matcher;

        do {

            System.out.println("Enter your mobile number : ");

            String contactNum = sc.next();

            matcher = p1.matcher(contactNum);

        }while(!matcher.matches());

        System.out.println("Finally you entered a right mobile number");
    }
}


