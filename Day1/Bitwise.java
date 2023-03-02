import java.util.*;
public class Bitwise
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter first number:");
int a=s.nextInt();
System.out.print("Enter second number:");
int b=s.nextInt();
System.out.println(a|b);
System.out.println(a&b);
System.out.println(a^b);
System.out.println(a<<1);
System.out.println(b>>>1);
}
}
