class SecondLargest
{
public static void main(String args[])
{
int arr[]={3,2,5,18,20,13,7};
int n=arr.length;
int max1=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{
if(arr[i]>max1)
{
max2=max1;
max1=arr[i];
}
else if(arr[i]>max2)
{
max2=arr[i];
}
}
System.out.println(max2);
}
}
