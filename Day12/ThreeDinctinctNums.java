public class ThreeDinctinctNums
{
public static void main(String args[])
{
int[] arr={3,6,2,30,15,5,7};
int first=0,second=0,third=0;
//int first=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>first)
{
third=second;
second=first;
first=arr[i];
}
else if(arr[i]>second)
{
third=second;
second=arr[i];
}
else if(arr[i]>third)
third=arr[i];
}
System.out.println("first:"+first+"second:"+second+"third:"+third);
}
}

