public class ArraysIntersection
{
public static void main(String args[])
{
int arr1[]={1,3,5,7};
int arr2[]={2,4,5,6};
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
if(arr1[j]==arr2[j])
{
System.out.println(arr1[i]+" ");
break;
}
}
}
}
}

