public class BinarySearch
{
public static void main(String args[])
{
int arr[]={1,2,4,5,7,9,12};
int x=7;
System.out.print(binarySearch(arr,x,0,arr.length-1));
}
static boolean binarySearch(int arr[],int low,int high,int x)
{
if(low<=high)
{
int mid=low+(high-low)/2;
if(arr[mid]==x)
return true;
else if(arr[mid]<x)
return binarySearch(arr,x,high,low=mid+1);
else
return binarySearch(arr,x,low,high=mid-1);
}
return false;
}
}

