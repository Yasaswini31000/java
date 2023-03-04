import java.util.Scanner;
public class Myclass
{
public static void main(String args[])
{
int n=12345;
int result=1;
boolean flag=true;
while(n!=0)
{
if(flag)
{
result=result*n%10;
flag=false;
}
else
{
result=(result*10)+(n%10);
}
n/=10;
}
System.out.println(result);
}
}
