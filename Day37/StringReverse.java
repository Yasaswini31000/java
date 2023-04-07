public class StringReverse_Mid
{
public static void main(String args[])
{
String str="programming";
String s="";
for(int i=0;i<str.length();i++)
{
s+=str.charAt(str.length()-i-1);
}
int start=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
for(int j=i-1;j>start;j--)
System.out.print(s.charAt(j));
System.out.print(" ");
start=i;
}
}
}
}
