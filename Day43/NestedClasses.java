public class NestedClasses
{
public static void main(String args[])
{
CPU c1=new CPU();
CPU.Processor p1=c1.new Processor();
CPU.RAM r1=c1.new RAM();
System.out.println("Processor cache:"+p1);
System.out.println("RAM clock speed:"+r1);
}
}
class CPU
{
double price;
class Processor
{
double cores;
String Manufactures;
double getCache()
{
return 4.3;
}
}
protected class RAM
{
double memory;
String Manufactures;
double getClockSpped()
{
return 5.5;
}
}
}
