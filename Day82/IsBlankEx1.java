import java.util.Scanner;
public class IsBlankEx1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String firstName = "  ";

        String lastName = "I am groot";

        if(firstName.isEmpty() || firstName.isBlank()) {

            System.out.println("Enter any string : ");

            firstName = sc.next();

            System.out.println(firstName +" "+ lastName);
        }

        String s1 = "";

        System.out.println(s1.isBlank());

        String s2 = "\t\n";

        System.out.println(s2.isBlank());
    }
}
