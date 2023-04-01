public class Count7
{
public static void main(String args[])
{
int n=467;
System.out.println(count7(n));
}
static int count7(int n)
{
  if(n==0)
  return 0;
  if(n%100==77)
  return 2+count7(n/10);
  if(n%10==7)
  return 1+count7(n/10);
  return count7(n/10);
 } 
}

