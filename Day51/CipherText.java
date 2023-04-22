public class CipherText
{
public static void main(String args[])
{
String str="hello";
int key=3;
char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
for(int i=0;i<=25;i++)
{
for(int j=0;j<=str.length();j++)
{
if(!(str.charAt(j)==' '))
{
int index=str.charAt(j)-97-i;
int curNow=index%26;
System.out.print((char)(arr[curNow]+key)+" ");
}
else
System.out.println(" ");
}
}
}
}
       
       
