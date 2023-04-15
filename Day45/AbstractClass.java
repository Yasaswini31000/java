public class AbstractClass
{
public static void main(String[] args) 
{
//Laptop l1=new Laptop();
//l1.storage();
Mobile m1=new Mobile();
m1.play();
m1.storage();
}
}
abstract class Gadjets
{
abstract void play();
abstract void storage();
}
abstract class Laptop extends Gadjets
{
void storage()
{
System.out.println("It has a storage capacity upto 1TB");
}
}
class Mobile extends Gadjets
{
void storage()
{
System.out.println("The storage is upto 218GB ");
}
void play()
{
System.out.println("We can play music,movies and games too");
}
}

