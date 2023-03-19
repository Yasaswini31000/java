public class ThreeSum
{
public static void main(String args[])
{
int arr[]={2,5,3,1,7,5,9,12,5};
int sum=16;
for(int i=0;i<arr.length-2;i++)
{
for(int j=i+1;j<arr.length-1;j++)
{
for(int k=j+1;k<arr.length;k++)
{
if(arr[i]+arr[j]+arr[k]==sum)
{
System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" ");
}
}
}
}
}
}
