public class SumDigits
{
public static void main(String args[])
{
int n=55;
System.out.println(sumDigits(n));
}
static int sumDigits(int n)
{
if(n==0)
return 0;
else
return n%10+sumDigits(n/10);
}
}

