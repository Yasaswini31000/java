public class StringMaxCount
{
public static void main(String args[])
{
String str="Java is an object oriented programming language";
int max=Integer.MIN_VALUE;
int s=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)!=' ')
s++;
else
{
if(s>max)
max=s;
s=0;
}
}
System.out.println(max);
}
}
