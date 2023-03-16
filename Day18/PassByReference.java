import java.util.Arrays;
public class PassByReference
{
public static void main(String args[])
{
int[] arr=new int[2];
arr[0]=3;
arr[1]=5;
add(arr);
System.out.println(Arrays.toString(arr));
}
static void add(int[] arr)
{
for(int i=0;i<arr.length;i++)
arr[0]=10;
System.out.println(Arrays.toString(arr));
}
}
