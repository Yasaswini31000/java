public class StringMaxSum
{
public static void main(String args[])
{
int arr[][]={
{1,2,3},
{3,4,5},
{4,5,6}
};
String str="Row";
int index=-1;
int MaxSum=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
int sum=0;
for(int j=0;j<arr[0].length;j++)
{
sum+=arr[i][j];
}
if(sum>MaxSum)
{
MaxSum=sum;
index=i;
}
}
for(int i=0;i<arr[0].length;i++)
{
int sum=0;
for(int j=0;j<arr.length;j++)
{
sum+=arr[i][j];
}
if(sum>MaxSum)
{
MaxSum=sum;
index=i;
str="Col";
}
}
System.out.println(str +" "+ (index+1) +" with sum : "+MaxSum);
}
}
  
