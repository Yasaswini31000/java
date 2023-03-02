import java.util.Scanner;
public class Bitwise3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
int s=1;
while(s<=n)
{
if(s==n)
{
System.out.print("Yes");
return;
}
s<<=1;
}
System.out.print("No");
}
}

