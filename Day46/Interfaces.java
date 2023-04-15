public class Interfaces
{
public static void main(String args[])
{
Hello h=new Hello();
h.show();
}
}
interface Rock
{
public void show();
}
class Hello implements Rock
{
public void show()
{
System.out.println("Interfaces");
}
}
