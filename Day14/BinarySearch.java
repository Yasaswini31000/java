public class BinarySearch
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
int n=arr.length,x=20;
int low=0,high=arr.length-1;
int mid=(low+high)/2;
while(low<=high)
{
if(arr[mid]<x)
{
low=mid+1;
}
else if(arr[mid]==x)
{
System.out.println("Element found at mid index:"+mid);
return;
}
else
{
high=mid-1;
}
mid=(low+high)/2;
}
if(low>high)
{
System.out.println("Element not found");
return;
}
}
}
