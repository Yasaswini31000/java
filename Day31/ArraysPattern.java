public class ArraysPattern
{
public static void main(String args[])
{
int arr[][]={
{1,2,3},
{4,5,3},
{5,6,7},
};
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[0].length;j++)
{
if(j==0||(i<arr.length/2&&j==arr[0].length-1)||i==arr.length/2||i==0)
System.out.print(arr[i][j]+" ");
else
System.out.print("  ");
}
System.out.println();
}
}
} 
