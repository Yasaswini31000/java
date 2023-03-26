public class Pangram
{
public static void main(String args[])
{
String str="The quick brown fox jumps over the lazy dog";
boolean[] alphabets=new boolean[26];
int n=str.length();
for(int i=0;i<n;i++)
{
int index=str.charAt(i)-97;
if(index>=0&&index<alphabets.length)
alphabets[index]=true;
}
for(var x:alphabets)
{
if(x==false)
{
System.out.println("not a pangram");
}
else
System.out.println("Pangram");
return;
}
}
}

