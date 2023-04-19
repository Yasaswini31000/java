public class Sample
{
public static void main(String args[]) 
{
Hill h1=new Hill();
Hill h2=new Hill();
Hill h3=new Hill();
System.out.println(h3.h);  
}
}
class Hill
{
static  int h;
Hill()
{
h++;
}
}
