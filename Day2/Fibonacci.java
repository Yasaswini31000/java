import java.util.*;
public class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter first number:");
int n1=sc.nextInt();
System.out.print("enter second number:");
int n2=sc.nextInt();
System.out.print("enter count:");
int count=sc.nextInt();
int  n3,i;
for(i=2;i<count;i++)
{
n3=n1+n2;
System.out.println(" "+n3);
n1=n2;
n2=n3;
}
}
}

