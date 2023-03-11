import java.util.Arrays;
class RotateArray
{
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
int n=arr.length,temp=0;
for(int i=n-1;i>=0;i--)
{
int c=0;
for(int j=0;j<n;j++)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
c++;
}
System.out.println(Arrays.toString(arr));
return;
}
}
}

