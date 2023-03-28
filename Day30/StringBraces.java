public class StringBraces
{
public static void main(String args[])
{
String str="{()[]}({})";
int open=0,close=0,mismatch=0;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='(')
{
open++;
}
else if(ch==')')
{
if(open>0)
{
open--;
close++;
}
else
{
mismatch++;
}
}
if(ch=='{')
{
open++;
}
else if(ch=='}')
{
if(open>0)
{
open--;
close++;
}
else
{
mismatch++;
}
}
if(ch=='[')
{
open++;
}
else if(ch==']')
{
if(open>0)
{
open--;
close++;
}
else
{
mismatch++;
}
}
}
System.out.println(open+" "+close+" "+mismatch);
}
}


