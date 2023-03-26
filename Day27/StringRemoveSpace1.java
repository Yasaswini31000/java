public class StringRemoveSpace1
{
public static void main(String args[])
{
String str="welcome to   java";
int words=0;
for(var x:str.toCharArray())
{
if(x==' ')
words++;
}
String x[]=str.split(" ");
for(var y:x)
System.out.print(y);
}
}

