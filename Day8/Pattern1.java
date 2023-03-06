
 /*


 1 2 3 4 5
 1 2 3 4 *
 1 2 3 * * * 
 1 2 * * * * *
 1 * * * * * * *
 
 */
 
 
 public class Pattern1
 {
 public static void main(String args[])
 {
 int n=5;
 for(int i=1;i<=n;i++)
 {
 for(int j=1;j<=n-i+1;j++)
 System.out.print(j+" ");
 for(int k=1;k<=i-1;k++)
 
 System.out.print("* ");
 
 for(int j=1;j<=i-2;j++)
 
 System.out.print("* ");

 System.out.println();
 }
 }
 }
 
 
 
 
