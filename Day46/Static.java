public class Static
{
public static void main(String args[])
{
NetWorth parent=new NetWorth();
parent.family();
System.out.println(NetWorth.x);
}
}
class NetWorth
{
static int x=12000;
void family()
{
x-=100;
}
void sellProperty(int value)
{
x+=value;
}
static int getMyFamily()
{
return x;
}
}

