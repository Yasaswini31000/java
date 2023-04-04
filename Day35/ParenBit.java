public class ParenBit
{
public static void main(String args[])
{
String str="catcow";
System.out.println(parenBit(str));
}
static String parenBit(String str)
{
if(str.charAt(0)=='(')
{
int n=str.length();
if(str.charAt(n-1)==')')
return str;
else
return parenBit(str.substring(0,n-1));
}
else
{
return parenBit(str.substring(1));
}
}
}

