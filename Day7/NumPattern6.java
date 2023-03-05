
/*

 1
 2 1
 3 2 1
 4 3 2 1
 5 4 3 2 1
 
 */


import java.util.Scanner;
public class NumPattern6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
int s=1;
for(int j=1;j<=i;j++)
{
System.out.print((s--)+" ");
}
System.out.println();
}
}
}

