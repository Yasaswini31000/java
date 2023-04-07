import java.util.Arrays;
public class ArraysUnion
{
public static void main(String args[])
{
int arr1[]={1,2,3,4};
int arr2[]={5,3,8,2};
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
if(arr1[i]==arr2[j])
break;
else
arr1[i]=arr2[j];
}
}
System.out.println(Arrays.toString(arr));
}
}
