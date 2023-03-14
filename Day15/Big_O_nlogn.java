public class Big_O_nlogn
{
public static void main(String args[])
{
int n = 50;
for(int i=1;i<=n;i++)
{
for(int j=1;j<n;j=j*2) 
{
System.out.println("Welcome to Java....: " + i +" and "+ j);
}
}
}
}
