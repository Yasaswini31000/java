
public class PeakArray
{
public static void main(String args[])
{
int arr[]={5,31,45,3,16,30};
int n=arr.length;
if((n==1)||arr[0]>=arr[1])
System.out.println("peak element");
if(arr[n-1]>arr[n-2])
System.out.println("peak element:"+n);
for(int i=1;i<n-1;i++)
{
if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
System.out.println(i);
}
}
}

