public class Recursion
{
public static void main(String args[])
{
int n=4;
fun(n);
System.out.print("Done");
return;
}
void fun(int n)
{
if(n==1)
return 1;
System.out.println(n);
fun(n-1);
return;
}
}
