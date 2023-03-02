import java.util.Scanner;
public class Bitwise1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
{
if((n&1)==0)
System.out.print("UNSET");
else
System.out.print("SET");
}
}
}
