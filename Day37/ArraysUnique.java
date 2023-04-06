public class ArraysUnique
{
public static void main(String args[])
{
int arr[]={1,3,2,4,3,7,5,1,6,5,7};
for(int i=0;i<arr.length;i++)
{
int j;
for(j=0;j<arr.length;j++)
{
if(i!=j)
{
if(arr[i]==arr[j])
break;
}
}
if(j==arr.length)
{
System.out.println(arr[i]+" ");
}
}
}
}

