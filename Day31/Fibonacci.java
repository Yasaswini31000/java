public class Fibonacci
{
public static void main(String args[])
{
int count=6;
System.out.println(fibonacci(count));
}
static int fibonacci(int count)
{
if(count==0)
return 0;
if(count==1||count==2)
return 1;
else
return fibonacci(count-1)+fibonacci(count-2);
}
}

