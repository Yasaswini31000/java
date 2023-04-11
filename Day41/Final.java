public class Final
{
public static void main(String args[])
{
Sample s1=new Sample();
s1.display();
}
}
class FinalDemo
{
public final void display()
{
System.out.println("This is a final method.");
}
}
class Sample extends FinalDemo
{
public void display()
{
System.out.println("The final method is overriden.");
}
}
