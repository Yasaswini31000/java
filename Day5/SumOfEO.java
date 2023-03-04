import java.util.Scanner;
public class SumOfEO
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
char choice;
int evenSum=0;
int oddSum=0;
do
{
System.out.println("Enter the number :");
num=sc.nextInt();
if(num%2==0)
{
evenSum+=num;
}
else
{
oddSum+=num;
}
System.out.println("Do you want to continue y/n? :");
choice=sc.next().charAt(0);
}while(choice=='y'||choice=='Y');
System.out.println("Sum of even numbers :");
System.out.println("Sum of odd numbers :");
}
}
