public class StringOperations1
{
public static void main(String args[])
{
String str1="hello hi";
String str2="hello world";
for(int i=0;i<str1.length();i++)
{
if(str1.charAt(i)==str2.charAt(0))
{
int k=i+1;
int count=0;
for(int j=1;j<str2.length();j++)
{
if(str2.charAt(j)!=str1.charAt(k))
{
count++;
}
}
if(count==0)
{
System.out.print("yes");
return;
}
}
}
}
}
