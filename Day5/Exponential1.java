import java.util.Scanner;
public class Exponential1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
System.out.print("Enter any number:");
int x=sc.nextInt();
double x1=x*(3.14159265359/180.0);
double result=0;
int sign=1;
for(int i=1,j=1;i<=n;i++,j+=2)
{
result+=((sign*Math.pow(x1,j))/fact(j));
sign*=-1;
}
System.out.print(result);
}
static int fact(int n)
{
int result=1;
for(int i=1;i<=n;i++)
result=result*i;
return result;
}
}
