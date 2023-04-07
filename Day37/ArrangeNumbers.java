import java.util.Arrays;
public class ArrangeNumbers
{
public static void main(String args[])
{
int n=5;
int arr[]=new int[n];
int start=1;
int i;
for(i=0;i<n/2;i++)
{
arr[i]=start;
start+=2;
}
arr[i]=n;
if(n%2==0)
start=n-2;
else
start=n-1;
for(int j=i+1;j<n;j++)
{
arr[j]=start;
start-=2;
}
System.out.println(Arrays.toString(arr));
}
}
