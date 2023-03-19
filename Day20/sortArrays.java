import java.util.Arrays;
public class sortArrays
{
public static void main(String args[])
{
int arr[]={1,3,5};
int arr2[]={2,4,6};
int max=arr.length>arr2.length?arr.length:arr2.length;
int arr3[]=new int[max];
int i=arr.length-1;
int j=arr2.length-1;
int k=0;int z=1;
while(i>=0&&j>=0)
{
int sum=arr[i]+arr2[j]+k;
arr3[max-z]=sum%10;
k=sum/10;
z++;
i++;
j++;
}
System.out.println(Arrays.toString(arr3));
}
}
