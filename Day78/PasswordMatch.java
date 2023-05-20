import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatch {
    public static void  main(String[] args) {

        Pattern p1 = Pattern.compile("password");

        Scanner sc = new Scanner(System.in);

        Matcher matcher;

        int count = 0;

        do {

            System.out.println("Enter your password: ");

            String passWord = sc.next();

            matcher = p1.matcher(passWord);

            if(matcher.matches()) {

                System.out.println("You entered correct password");

                break;
            }
            else if(count == 6) {

                System.out.println("Timed out, wait for 30 seconds and try again");

                try {

                    Thread.sleep(3000);

                } catch (InterruptedException e) {

                    throw new RuntimeException(e);
                }

                count = 0;

            }
            else {

                System.out.println("You have entered wrong password try again  "+(6-count)+"  chances left ");

                count++;
            }

        }while(!matcher.matches());

        System.out.println("Finally you entered a right password..!");
    }
}


