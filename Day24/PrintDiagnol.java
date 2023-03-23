//program for printing diagnol arrays
public class PrintDiagnol
{
public static void main(String args[])
{
int arr[][]={
{1,2,3,4,5},
{2,4,6,8,10},
{3,4,5,6,7},
{1,3,5,7,11},
{1,4,7,10,5},
};
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==j)
{
System.out.print(arr[i][j]+" ");
}
else if(j==n-i-1)
System.out.print(arr[i][j]+" ");
else
System.out.print(" ");
}
System.out.println();
}
}
}
