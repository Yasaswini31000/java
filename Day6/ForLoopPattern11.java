
/*


       *
      * *
     *   *
    *     *
   *       *
    *     *
     *   *
      * *
       *

*/



import java.util.Scanner;
public class ForLoopPattern11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number :");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.print("* ");
}
for(int i=2;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
System.out.print(" ");
for(int k=i-1;k<=(i-1)*2-1;k++)
System.out.print("* ");
System.out.println();
}
int a=n*2-1;
for(int i=1,l=a-(i*i)-1;i<=n;i++,l-=2)
{
for(int j=1;j<=i-1;j++)
System.out.print(" ");
for(int k=1;k<=l;k++)
System.out.print("* ");
System.out.println();
}
for(int i=0;i<n-2;i++)
{
System.out.print("* ");
}
}
}
