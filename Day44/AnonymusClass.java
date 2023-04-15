public class AnonymusClass
{
public static void main(String args[])
{
Anonymus an=new Anonymus();
an.createClass();
}
}
class Rectangle
{
public void display()
{
System.out.println("It has four sides");
}
}
class Anonymus
{
public void createClass()
{
Rectangle r1=new Rectangle()
{
public void display()
{
System.out.println("The anonymus class");
}
};
r1.display();
}
}


