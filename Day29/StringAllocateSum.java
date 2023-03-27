public class StringAllocateSum
{
public static void main(String args[])
{
int a[]=new int[128];
String str="hello world";
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
System.out.println(sum);
}
}
  
