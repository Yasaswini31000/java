//program for printing snake shape arrays
public class PrintSnake
{
public static void main(String args[])
{
int arr[][]={
{1,2,3,4,5},
{2,4,6,8,10},
{3,4,5,6,7},
{1,3,5,7,11},
{1,4,7,10,5},
};
//int n=arr.length;
for(int i=0;i<arr.length;i++)
{
if(i%2==0)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
}
else
{
for(int j=0;j<arr[i].length-1;j++)
{
System.out.print(arr[i][j]+" ");
}
}
}
}
}
