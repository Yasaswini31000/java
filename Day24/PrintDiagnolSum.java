//program for printing diagnol arrays sum
public class PrintDiagnolSum
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
int sum1=0,sum2=0;
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==j)
{
sum1+=arr[i][j];
}
if(j==n-i-1)
{
sum2+=arr[i][j];
}
System.out.println(sum1+" "+sum2);
}
}
}
}
