public class Super
{
public static void main(String args[])
{
Animal a1=new Animal();
}
}
class Cow
{
Cow()
{ 
this(10);
System.out.println("This is a cow");
}
Cow(int x)
{
System.out.println("Cow gives milk");
}
}
class Animal extends Cow
{
Animal()
{ 
super();
System.out.println("Cow has four legs");
}
Animal(int x)
{
System.out.println("It has horns");
}
}
