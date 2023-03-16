public class PassByValue
{
public static void main(String args[])
{
int a=5;
add(a);
System.out.println(a);
}
static void add(int a)
{
a++;
System.out.println(a);
}
}
