
public class PeakArray1
{
public static void main(String args[])
{
int arr[]={4,5,12,16,34,7};
int n=arr.length,peak=arr[0];
if(n==1)
{
System.out.print("Peak Element :"+arr[0]);
return;
}
for(int i=0;i<n;i++)
{
if(i==0)
{
if(arr[i+1]>arr[i])
peak=arr[i+1];
}
else if(i==(n-1))
{
if(arr[i-1]<arr[i])
peak=arr[i];
}
else
{
if(arr[i-1]<arr[i]&&arr[i+1]<arr[i])
peak=arr[i];
}
}
System.out.print(peak);
}
}


