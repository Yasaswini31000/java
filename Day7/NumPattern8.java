
/*

 1 0 1 0 1
 0 1 0 1 0
 1 0 1 0 1
 0 1 0 1 0
 1 0 1 0 1
 
 
 */


import java.util.Scanner;
public class NumPattern8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
int start=1;
for(int i=1;i<=n;i++)
{
int s=i%2;
for(int j=1;j<=n;j++)
{
System.out.print(s+" ");
if(s==1)
s=0;
else
s=1;
}
System.out.println();
}
}
}

