import java.util.Arrays;
public class ArrayEquilibrium
{
public static void main(String args[])
{
int arr[]={3,2,6,4,1,7,0,5,9};
for(int i=0;i<arr.length;i++)
{
int lsum=0;
int rsum=0;
for(int j=0;j<i;j++)
lsum+=arr[j];
for(int j=i+1;j<arr.length-1;j++)
rsum+=arr[j];
if(lsum==rsum){
System.out.println(i);
return;
}
}
System.out.println(-1);
}
}
