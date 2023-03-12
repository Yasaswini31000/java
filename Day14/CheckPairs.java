public class CheckPairs
{
public static void main(String args[])
{
int arr[]={2,4,6,8};
int n=arr.length,sum=12;
for(int i=0;i<n-1;i++)
{
for(int j=i+1;i<n;i++)
{
if(arr[i]+arr[j]==sum)
{
System.out.println(arr[i]+" "+arr[j]);
return;
}
}
System.out.println(false);
}
}
}
