/*
  
  * * * * *
   * * * *
    * * *
     * *
      *
      

*/

import java.util.Scanner;
public class ForLoopPattern6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i-1;j++)
System.out.print(" ");
for(int k=5;k>=i;k--)
System.out.print("* ");
System.out.println();
}
}
}




