import java.util.Arrays;
class Sorting_Zeros_Ones
{
public static void main(String args[])
{
int arr[]={1,0,0,1,1,1,0,0,1};
int zeroes=0;
int ones=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
zeroes++;
else
ones++;
}
int i;
for(i=0;i<zeroes;i++)
{
arr[i]=0;
}
for(int j=i;j<arr.length;j++)
arr[j]=1;
System.out.print(Arrays.toString(arr));
}
}

