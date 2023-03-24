//Addition of two matrices of arrays 
import java.util.Arrays;
public class MatricesAddition
{
public static void main(String args[])
{
int a[][]={
{1,3},
{2,4}
};
int b[][]={
{1,2},
{3,4}
};
if((a.length!=b.length)||(b[0].length!=a[0].length))
{
System.out.print("Addition of two matrices is not posible");
return;
}
int result[][]=new int[a.length][a[0].length];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
result[i][j]=a[i][j]+b[i][j];
}
}
for(var x:result)
{
for(var y:x)
System.out.print(y+" ");
System.out.println();
}
}
}
