public class ArrayReverse
{
public static void main(String args[])
{
int n=123457;
rev(n);
}
static void rev(int n)
{
if(n==0)
return;
int lDig=n%10;
System.out.println(lDig);
rev(n/10);
return;
}
}
