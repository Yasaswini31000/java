
/*

* * * * *
 * * * *
  * * *
   * *
    *
    *
    *
   * *
  * * *
 * * * *
* * * * *


*/

import java.util.Scanner;
public class ForLoopPattern9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
System.out.print(" ");
for(int k=n;k>=i;k--)
System.out.print("* ");
System.out.println();
}
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j+=2)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
System.out.print("* ");
System.out.println();
}
}
}
