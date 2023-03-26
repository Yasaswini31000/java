public class StringOperations2
{
public static void main(String args[])
{
String str1="hello hi";
String str2="hello world";
str1=str1.concat(str2);
str2=str1.substring(0,str1.length()-str2.length());
str1=str1.substring(str2.length());
}
}
