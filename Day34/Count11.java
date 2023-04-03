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
if(str.substring(0,2).equals("11"))
return 1+count11(str.substring(2));
else
return count11(str.substring(1));
}
}

