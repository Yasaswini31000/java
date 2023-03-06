

 /*
 
 1 * * * *
 1 2 * * *
 1 2 3 * *
 1 2 3 4 *
 1 2 3 4 5
 
 */
 
 public class Pattern2
 {
 public static void main(String args[])
 {
 int n=8;
 for(int i=1;i<=n;i++)
 {
 for(int j=1;j<=i;++j)
 System.out.print(j);
 for(int l=i;l<=n;l++)
 System.out.println(" ");
 for(int k=1;k<=n-i;k++)
 System.out.print("* ");
 System.out.println();
 }
 }
 }
