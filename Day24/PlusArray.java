//program on plus shape array matrix
public class PlusArray
{
public static void main(String args[])
{
int arr[][]={
{1,2,3,4,5},
{2,4,6,8,10},
{1,3,5,7,9},
{1,0,1,0,1},
{9,8,7,6,5},
};
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
if(i==(arr.length/2)||j==(arr[i].length/2))
{
System.out.print(arr[i][j]+" ");
}
else
System.out.print(" ");
}
System.out.println();
}
}
}
