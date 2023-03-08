import java.util.Arrays;
class Sorting012
{
public static void main(String args[])
{
int arr[]={0,2,1,2,0,2,1,2,2,2,0,0,1,0,2,1};
int n=arr.length;
int zeroes=0,ones=0,twos=0;
for(int i=0;i<n;i++)
{
if(arr[i]==0)
zeroes++;
else if(arr[i]==1)
ones++;
else
twos++;
}
for(int i=0;i<zeroes;i++)
arr[i]=0;
for(int i=zeroes;i<ones+zeroes;i++)
arr[i]=1;
for(int i=ones+zeroes;i<n;i++)
arr[i]=2;
System.out.println(Arrays.toString(arr));
}
}

