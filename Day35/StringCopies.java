public class StringCopies
{
public static void main(String args[])
{
String sublen="catcowcat";
String strlen="cat";
int n=2;
System.out.println(strCopies(sublen,strlen,n));
}
static boolean strCopies(String str, String sub, int n) 
{
int sublen=sub.length();
int strlen=str.length();
if(strlen<sublen)
{
if(n<=0)
return true;
else
return false;
}
if(str.substring(0,sublen).equals(sub))
return strCopies(str.substring(1),sub,n-1);
else
return strCopies(str.substring(1),sub,n);
}
}

