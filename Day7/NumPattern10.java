
/*

 A
 A B
 A B C 
 A B C D
 A B C D E


*/


import java.util.Scanner;
public class CharPattern10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
int start='A';
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(start+" ");
}
System.out.println();
}
}
}

