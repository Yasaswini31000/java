public class FirstRepeate
{
public static void main(String[] args)
{
int arr[]={2,4,3,5,3,4,1};
int n=arr.length,temp=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[i]);
return;
}
}
}
}
}
