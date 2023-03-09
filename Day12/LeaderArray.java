public class LeaderArray
{
public static void main(String args[])
{
int arr[]={3,6,2,30,15,5,7};
int c=0;
int n=arr.length;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]<arr[j])
c++;
}
if(c==0)
System.out.println(arr[i]);
}
}
}
