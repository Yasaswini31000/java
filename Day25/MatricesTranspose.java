//Transpose of two matrices of arrays 
import java.util.Arrays;
public class MatricesTranspose
{
public static void main(String args[])
{
int a[][]={
{1,3,7},
{2,4,7},
{3,5,9}
};
int x=a.length;
int y=a[0].length;
int res[][]=new int[x][y];
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
res[i][j]=a[j][i];
}
}
for(var b:res)
{
for(var c:b)
System.out.print(c+" ");
System.out.println();
}
}
}
