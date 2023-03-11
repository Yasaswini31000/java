public class MissingNumber
{
public static void main(String args[])
{
int n=5;
int arr[]={1,3,4,5};
for(int i=1;i<n;i++)
{
int c=0;
for(int j=0;j<n;j++)
{
if(arr[j]==i)
c++;
}
if(c==0)
{
System.out.println(i);
return;
}
}
}
}

