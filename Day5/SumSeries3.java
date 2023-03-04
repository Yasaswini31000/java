import java.util.Scanner;
public class SumSeries3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum,num1,num2;
char choice;
do
{
System.out.print("Enter first number:");
num1=sc.nextInt();
System.out.print("Enter first number:");
num2=sc.nextInt();
sum=num1+num2;
System.out.print(sum);
System.out.println("Do u wants to continue press y/n:");
choice=sc.next().charAt(0);
System.out.println();
}while(choice=='y'||choice=='Y');
}
}
