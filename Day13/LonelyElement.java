public class LonelyElement
{
public static void main(String[] args)
{
int arr[]={1,2,3,4,2,3,1};
int n=arr.length;
for(int i=0;i<n;i++)
{
int c=0;
for(int j=0;j<n;j++)
{
if(arr[i]==arr[j])
{
c++;
}
}
if(c==1)
{
System.out.println(arr[i]);
return;
}
}
}
}
