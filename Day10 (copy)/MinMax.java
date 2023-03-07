public class MinMax
{
public static void main(String args[])
{
int arr[]={12,7,32,60,18,3,49,28};
int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
for(var x:arr)
{
if(x>max)
max=x;
if(x<min)
min=x;
}
System.out.println("min:"+min+"\n"+"max:"+max);
}
}
