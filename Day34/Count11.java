public class Count11
{
public static void main(String args[])
{
String str="173114511";
System.out.println(count11(str));
}
static String count11(String str)
{
if(str.length()<2)
return str;
if(str.charAt(0)=='1'||str.charAt(1)=='1')
return 1+count11(str.substring(2));
else
return count11(str.substring(1));
}
}

