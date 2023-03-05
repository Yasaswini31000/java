
/*

      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1


*/


import java.util.Scanner;
public class NumPattern3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
int start=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
int s=1;
for(int k=0;k<=i;k++)
{
System.out.println(s+" ");
s=s*(i-k)/(k+1);
}
System.out.println();
}
}
}
