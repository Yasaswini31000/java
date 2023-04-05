public class LinearSearch
{
public static void main(String args[])
{
int arr[]={10,3,7,2,4,9};
int x=3;
int eind=arr.length-1;
System.out.println(findInd(arr,x,eind));
}
static boolean findInd(int arr[],int eInd,int x)
{
if(eInd==0)
return false;
if(arr[eInd]==x)
return true;
return findInd(arr,eInd-1,x);
}
}

