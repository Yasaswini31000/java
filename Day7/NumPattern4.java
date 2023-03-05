
/*

1
2 2
3 3 3 
4 4 4 4 
5 5 5 5 5


*/


import java.util.Scanner;
public class NumPattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
int start=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}

