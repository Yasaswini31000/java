public class ArrayNum2
{
public static void main(String args[])
{
int n=10;
num(n,1);
}
static void num(int n,int start)
{
if(start>n)
return;
System.out.print(start+" ");
num(n,start+1);
}
}
