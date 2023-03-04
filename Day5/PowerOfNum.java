import java.util.Scanner;
public class PowerOfNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number :");
int n=sc.nextInt();
System.out.print("Enter second number :");
int p=sc.nextInt();
int result=n;
for(int i=0;i<n-1;i++)
result*=result;
System.out.println(Math.pow(n,p));
}
}


