import java.util.Arrays;
public class KthElement
{
public static void main(String args[])
{
int arr[]={3,5,2,7,1};
int n=arr.length,k=2;
Arrays.sort(arr);
System.out.println(arr[k-1]);
}
}
/*for(int i=0;i<n;i++)
{
int small=i;
for(int j=i+1;j<n;i++)
{
if(arr[j]>arr[small])
small=j;
}
int temp=arr[i];
arr[i]=arr[small];
arr[small]=temp;
}
System.out.print(Arrays.toString(arr));
}
}
*/
