import java.util.*;
public class PrimeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
int n=sc.nextInt();
int i,count=0;
for(i=2;i<n;i++)
{
if(n%i==0)
{
count++;
return;
}
}
if(count==0)
System.out.print("\nPrime");
else
System.out.print("\nNot");
}
}

