class ConstructorOverloading
{
public static void main(String args[])
{
Example e1=new Example(8);
}
}
class Example
{
Example()
{
System.out.println("empty constructor");
}
Example(int a)
{
System.out.println("constructor with one parameters");
}
Example(String str,int a)
{
System.out.println("constructor with two parameters");
}
}
