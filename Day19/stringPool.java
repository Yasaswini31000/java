public class stringPool
{
public static void main(String args[])
{
char name[]={'w','e','l','c','o','m','e'};
String str="welcome";
String str2="";
for(int i=0;i<str.length();i++)
{
if(i!=3)
str2+=str.charAt(i);
else
str2+='l';
}
System.out.println(str.hashCode());
System.out.println(str2.hashCode());
}
}
