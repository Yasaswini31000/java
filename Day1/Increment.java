import java.util.*;
public class Increment
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter any number:");
int a=s.nextInt();
System.out.println(a++);
System.out.println(--a);
System.out.println(++a);
System.out.println(a--);
}
}
