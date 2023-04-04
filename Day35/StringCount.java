public class StringCount
{
public static void main(String args[])
{
String sublen="catcowcat";
String strlen="cat";
System.out.println(strCount(sublen,strlen));
}
static int strCount(String str, String sub)
{
int sublen=sub.length();
if(str.length()<sublen)
return 0;
if(str.substring(0,sublen).equals(sub))
return 1+strCount(str.substring(sublen),sub);
else
return strCount(str.substring(1),sub);
}
}

