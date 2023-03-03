public class Overflow
{
public static void main(String args[])
{
byte b=127;
b++;//here underflow occurs since we are 1 to the short which is of range,so it takes the maximum range value
System.out.println(b);
}
}
