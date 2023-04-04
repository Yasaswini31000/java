public class StringDist
{
public static void main(String args[])
{
String sublen="cccatcowcatbp";
String strlen="cat";
System.out.println(strDist(sublen,strlen));
}
static int strDist(String str, String sub)
{
int sublen=sub.length();
int strlen=str.length();
if(strlen<sublen)
return 0;
if(str.substring(0,sublen).equals(sub))
{
if(str.substring(strlen-sublen).equals(sub))
return str.length();
else
return strDist(str.substring(0,strlen-1),sub);
}
return strDist(str.substring(1),sub);
}
}

