import java.util.Arrays;
class ReverseArray
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6};
int i=0,j=arr.length-1,temp;
while(i<j)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
i++;
j--;
}
System.out.print(Arrays.toString(arr));
}
}

