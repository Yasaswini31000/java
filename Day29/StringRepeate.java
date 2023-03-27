public class StringRepeate
{
public static void main(String args[])
{
int a[]=new int[128];
String str="helloohiiworldd";
for(int i=0;i<str.length();i++)
{
int index=str.charAt(i);
a[index]+=1;
}
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
int appear=0;
for(int i=0;i<a.length;i++)
{
if(a[i]>0)
appear++;
}
System.out.println(str.length()-appear);
}
}
  
