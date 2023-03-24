public class StringPalindrome1
{
public static void main(String args[])
{
String str="MALAYALAM";
String rev="";
for(int i=0;i<str.length();i++)
{
rev+=str.charAt(str.length()-i-1);
}
if(rev.equals(str))
System.out.print("Palindrome");
else
System.out.print("Not Palindrome");
}
}
