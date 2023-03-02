import java.util.*;
public class Unary
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter first number:");
int a=s.nextInt();
System.out.print("Enter second number:");
int b=s.nextInt();
System.out.println(a=-a);
System.out.println(!(a>b));
System.out.println(b=+b);
System.out.println(a=--a);
System.out.println(a=~b);
}
}
