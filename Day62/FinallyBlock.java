import java.util.*;
public class FinallyBlock {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        try {
            System.out.println("Enter any number : ");
            int x=0/sc.nextInt();
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
        finally {
            System.out.println("Try and Catch blocks executed properly or not");
        }
    }
}
