public class Factorial
{
public static void main(String args[])
{
int n=5;
int res=factorial(n);
System.out.println(res);
}
static int factorial(int n) 
{
if(n==1)
return 1;
int res=n*factorial(n-1);
return res;
}
}

