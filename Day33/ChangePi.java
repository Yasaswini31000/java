public class ChangePi
{
public static void main(String args[])
{
String str="1pi23";
System.out.println(changePi(str));
}
static String changePi(String str)
{
if(str.length()<2)
return str;
if(str.substring(0,2).equals("pi "))
return "3.14"+changePi(str.substring(2));
else
return str.charAt(0)+changePi(str.substring(1));
}
}
