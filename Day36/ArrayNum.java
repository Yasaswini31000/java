public class ArrayNum
{
public static void main(String args[])
{
int n=10;
num(n);
}
static void num(int n)
{
if(n==0)
return;
System.out.print(n+" ");
num(n-1);
}
}
