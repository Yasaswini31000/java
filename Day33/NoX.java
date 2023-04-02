public class NoX
{
public static void main(String args[])
{
String str="xdbysxox";
System.out.println(noX(str));
}
static String noX(String str)
{
if(str.length()==0)
return "";
if(str.charAt(0)=='x')
return ""+noX(str.substring(1));
else
return str.charAt(0)+noX(str.substring(1));
}
}
