import java.util.Scanner;
public class Multiplication1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int input=0;
while((input=sc.nextInt())<1)
{
System.out.println("Enter a positive Number :");
}
for(int i=1;i<=10;i++)
{
System.out.println(input+" * "+i+" = "+input*i);
}
}
}
