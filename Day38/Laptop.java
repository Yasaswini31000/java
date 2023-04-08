class Laptop
{
public static void main(String args[])
{
Lenovo l=new Lenovo();
l.color("Silver");
l.storage();
l.play();
l.processor();
}
}
class Lenovo
{
String color;
String color(String str)
{
System.out.println("color:"+str);
return str;
}
void storage()
{
System.out.println("8GB,512GB");
}
void play()
{
System.out.println("playing games");
}
void processor()
{
System.out.println("11th Gen Intel® Core™ i5-1135G7 @ 2.40GHz × 8");
}
}

