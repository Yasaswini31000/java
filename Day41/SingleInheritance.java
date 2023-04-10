public class SingleInheritance
{
public static void main(String args[])
{
Redmi mi=new Redmi();
mi.price();
mi.fastCharge();
}
}
class Phone
{
int phonePrice=10000;
void price()
{
System.out.println("The minimum price of every phone starts from Rs.: "+phonePrice); 
}
}
class Redmi extends Phone
{
String chargeSpeed="30W";
void fastCharge() 
{
System.out.println("It has one of the fast charge feature and its speed is:"+chargeSpeed);
}
}


