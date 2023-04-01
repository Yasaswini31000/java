public class ChangeXY
{
public static void main(String args[])
{
String str="xdbysxox";
System.out.println(changeXY(str));
}
static String changeXY(String str)
{
if(str.length()==0)
return str;
if(str.charAt(0)=='x')
return "y"+changeXY(str.substring(1));
else
return str.charAt(0)+changeXY(str.substring(1));
}
}
