import java.util.*;
public class Swapping
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value into variable :");
int a=sc.nextInt();
System.out.println("Enter a value into variable :");
int b=sc.nextInt();
System.out.println("Enter a value into variable :");
int c=sc.nextInt();
a=a+b+c;
b=a-(b+c);
c=a-(b+c);
a=a-(b+c);
System.out.println(" a: " + a + " b: " + b + " c: " + c );
}
}

