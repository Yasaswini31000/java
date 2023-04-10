public class HierarchialInheritance
{
public static void main(String args[])
{
TwoWheeler bike=new TwoWheeler();
FourWheeler car=new FourWheeler();
bike.showPrice();
bike.finalPrice();
car.showPrice();
car.finalPrice();
}
}
class Vehicle
{
double basePrice=100000;
public void showPrice()
{
System.out.println("The price of the vehicle is : "+basePrice); 
}
}
class TwoWheeler extends Vehicle
{
double increasePriceBy=0.20;
void finalPrice() 
{
System.out.println("After modification, the price of the bike is Rs.: "+increasePriceBy);
}
}
class FourWheeler extends Vehicle
{
double increasePriceBy=1;
void finalPrice() 
{
System.out.println("After modification, the price of the bike is Rs.: "+increasePriceBy);
}
}


