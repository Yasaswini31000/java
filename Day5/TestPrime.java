import java.util.Scanner;
public class TestPrime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int num=sc.nextInt();
boolean flag=true;
for(int i=2;i<num;i++)
{
if(num%i==0)
{
flag=false;
break;
}
}
if(flag&&num>1)
{
System.out.println("Number is Prime ");
}
else
{
System.out.println("Number is not prime");
}
}
}

