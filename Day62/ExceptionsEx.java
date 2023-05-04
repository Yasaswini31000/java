import java.util.*;
public class ExceptionsEx {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        try {
            int x=sc.nextInt();
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(InputMismatchException e) {

            System.out.println("Input Miss Match Exception");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            int y=arr[7];
            System.out.println("Out of Bounds Exception");
        }
        System.out.println("This is an Example of Exceptions topic");

    }
}
