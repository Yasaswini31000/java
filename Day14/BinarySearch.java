public class BinarySearch
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
int n=arr.length,x=20,mid;
int low=0,high=arr.length-1;
for(int i=0;i<n-1;i++)
{
if(low<=high)
{
mid=low+(high-low)/2;
if(arr[mid]==x)
{
System.out.println("Element found at mid");
return;
}
if(arr[mid]<x)
high=mid+1;
{
System.out.println("Element found at index:"+i);
return;
else
high=mid-1;
}
System.out.println("Element not found");
return;
}
}
}
}
