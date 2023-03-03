public class Underflow
{
public static void main(String args[])
{
short s=-32768;
s--;//here underflow occurs since we are 1 to the short which is of range,so it takes the maximum range value
System.out.println(s);
}
}
