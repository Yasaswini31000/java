import java.util.Scanner;
public class SumSeries2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
double sum=0;
int sign=1;
for(int i=1;i<=n;i++)
{
sum+=(1.0*sign)/i;
sign*=-1;
}
System.out.println(sum);
}
}
