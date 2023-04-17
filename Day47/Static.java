public class Static 
{
public static void main(String args[])
{
Element el1=new Element();
Element el2=new Element();
Element el3=new Element();
}
}
class Element
{
Element()
{
System.out.println("The constructor block");
}
static
{
System.out.println("Static Block");
}
}
