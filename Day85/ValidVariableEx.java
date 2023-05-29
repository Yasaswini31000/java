import java.util.regex.*;

import java.util.Scanner;
public class ValidVariableEx {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String pattern = "^[{(+_.,)\\d!@#$%^&=*[0-9A-Za-z]?/~`]";

        System.out.println("Enter any String : ");

        String variable=sc.next();

        if(Pattern.matches(pattern, variable)) {

            System.out.println("Valid");
        }
        else {

            System.out.println("Invalid");
        }
    }
}
