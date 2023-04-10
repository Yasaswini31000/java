public class MultiLevelInheritance
{
public static void main(String args[])
{
Parrot p1=new Parrot();
p1.oviparus();
p1.fly();
Swan s1=new Swan();
s1.fly();
s1.color();
}
}
class Bird
{
void oviparus()
{
System.out.println("birds can give birth to their youngones by laying eggs"); 
}
}
class Parrot extends Bird
{
void fly() 
{
System.out.println("It can fly");
}
}
class Swan extends Parrot
{
void color() 
{
System.out.println("It is in white color");
}
}


