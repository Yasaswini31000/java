import java.util.Scanner;
public class Bitwise2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
{
int m=1;
int count=0;
for(int i=0;i<31;i++)
{
if((n&m)!=0)
count++;
m<<=1;
}
System.out.print("Number of set bits :"+count);
}
}
}
