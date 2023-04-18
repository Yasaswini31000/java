import java.util.*;
public class StaticMagicSquare
{
public static void main(String args[])
{
static int arr[][]={
{1,2,3},
{2,4,5},
{3,5,7}
};
do
{

}
while(!isMagicSquare());
System.out.println(Arrays.toString(arr));
}
public static boolean isMagicSquare()
{
int reqSum=arr[0][0]+arr[i][1]+arr[1][2];
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
return(arr[0][0]+arr[1][1]+arr[2][2]==reqSum&&arr[0][2]+arr[1][1]+arr[2][0]==reqSum)
}
}

