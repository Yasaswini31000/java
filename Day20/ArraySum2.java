public class ArraySum2
{
public static void main(String args[])
{
int sum=0;
int arr[]={1,3,5};
int arr2[]={2,4,6,8};
int i,j;
for(i=0,j=0;i<arr.length&&j<arr2.length;i++,j++)
{
sum+=arr[i]+arr2[j];
}
while(i<arr.length)
{
sum+=arr[i++];
}
while(j<arr2.length)
{
sum+=arr2[j++];
}
System.out.println(sum);
}
}
