public class MethodOverloading
{
static int methodInt(int x,int y)
{
return x+y;
}
static double methodDouble(double x,double y)
{
return x+y;
}
public static void main(String args[])
{
int m1=methodInt(4,6);
double m2=methodDouble(34.5432,56.234567);
System.out.println("int value :"+m1);
System.out.println("double value :"+m2);
}
}
