//Multiplication of two matrices of arrays 

public class MatricesMultiplication
{
public static void main(String args[])
{
int a[][]={
{1,4},
{2,5},
{3,6}
};
int b[][]={
{1,2,3},
{4,5,6}
};
int res[][]=new int[a.length][b[0].length];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b[0].length;j++)
{
for(int k=0;k<a.length;k++)
{
res[i][j]=a[i][k]*b[k][i];
}
for(var x:res)
{
for(var y:x)
System.out.print(y+" ");
System.out.println();
}
}
}
}
}
