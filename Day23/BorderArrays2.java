public class BorderArrays2
{
public static void main(String args[])
{
int arr[][]={
{1,2,3,4},
{2,4,6,8},
{1,3,5,7},
{1,2,4,8}
};
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
if(i==0||j==0||i==arr.length-1||j==arr[i].length-1)
System.out.print(arr[i][j]+" ");
else
System.out.print("  ");
}
System.out.println();
}
}
}
