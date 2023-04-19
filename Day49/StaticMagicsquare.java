public class StaticMagicsquare
{
static int arr[][]={
{2,3,4},
{6,1,5},
{4,6,3}
};
public static void main(String args[])
{
do
{
swapCells();
}while(!isMagicSquare());
display();
}
public static boolean isMagicSquare()
{
int reqSum=arr[0][0]+arr[0][1]+arr[0][2];
for(int i=0;i<3;i++)
{
if(arr[i][0]+arr[i][1]+arr[i][2]!=reqSum)
return false;
}
for(int i=0;i<3;i++)
{
if(arr[0][i]+arr[1][i]+arr[2][i]!=reqSum)
return false;
}
return (arr[0][0]+arr[1][1]+arr[2][2]==reqSum && arr[0][2]+arr[1][1]+arr[2][0]==reqSum);
}
static void swapCells()
{
int firstRow=(int)(Math.random()*3.0);
int firstCol=(int)(Math.random()*3.0);
int secondRow=(int)(Math.random()*3.0);
int secondCol=(int)(Math.random()*3.0);
int temp=arr[firstRow][firstCol];
arr[firstRow][firstCol]=arr[secondRow][secondCol];
arr[secondRow][secondCol]=temp;
}
static void display()
{
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}
