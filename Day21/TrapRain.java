public class TrapRain
{
public static void main(String args[])
{
int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
int rain=0;
for(int i=0;i<arr.length-1;i++)
{
int leftMax=arr[i];
for(int j=0;j<i;j++)
{
if(arr[j]>leftMax)
leftMax=arr[j];
}
int rightMax=arr[i];
for(int k=i+1;k<arr.length;k++)
{
if(arr[k]>rightMax)
leftMax=arr[k];
}
int min=Math.min(leftMax,rightMax);
int count=min-arr[i];
rain+=count;
}
System.out.println(rain);
}
}
