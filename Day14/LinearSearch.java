public class LinearSearch
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10,12,14};
int n=arr.length;
int x=10;
for(int i=0;i<n;i++)
{
if(arr[i]==x)
{
System.out.println("Element found at index :"+i);
return;
}
}
System.out.println("Element not found");
}
}
