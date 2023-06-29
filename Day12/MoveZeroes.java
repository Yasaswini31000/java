public class MoveZeroes
{
public static void main(String args[])
{
int arr[]={1,6,0,4,1,2,0,4,0,2,3,0,0,7};
int c=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]!=0)
{
arr[c]=arr[i];
c++;
}
}
while(c<arr.length)
{
arr[c]=0;
c++;
}
for(int j=0;j<arr.length;j++)
{
System.out.print(arr[j]+" ");
}
}
}
