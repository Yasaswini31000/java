public class StringOperations
{
public static void main(String args[])
{ 
String str="Hello World, Welcome to java...!";
int n=str.length();
boolean flag=true;
for(int i=0;i<n;i++)
{
if(flag==true)
{
System.out.print((char)(str.charAt(i)-32));
flag=false;
}
else if(str.charAt(i)==' ')
{
flag=true;
}
else
System.out.print(str.charAt(i));
}
}
}

