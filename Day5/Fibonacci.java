import java.util.Scanner;
public class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter terms of series:");
int n=sc.nextInt();
int n1=0,n2=1,n3;
System.out.print(n1+" "+n2+" ");
for(int i=3;i<=n;i++)
{
n3=n1+n2;
System.out.println(n3+" ");
n1=n2;
n2=n3;
}
}
}
