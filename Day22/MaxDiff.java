//program on maximum diff b/w two elements
public class MaxDiff
{
public static void main(String args[])
{
int arr[]={13,21,6,4,12,7,9,15};
int smallIndex=0;
for(int i=1;i<arr.length;i++)
{
if(arr[i]<arr[smallIndex])
smallIndex=i;
}
int largeIndex=smallIndex+1;
for(int i=smallIndex+2;i<arr.length;i++)
{
if(arr[i]>arr[largeIndex])
largeIndex=i;
}
System.out.println(arr[largeIndex]-arr[smallIndex]);
}
}
