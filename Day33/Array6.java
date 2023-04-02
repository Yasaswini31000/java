public class Array6
{
public static void main(String args[])
{
int[] arr={3,2,6,4,7};
int index=0;
System.out.println(array6(arr));
}
static boolean array6(int[] arr,int index)
{
if(index>=arr.length)
return false;
if(arr[index]==6)
return true;
else
return array6(arr,index+1);
}
}
