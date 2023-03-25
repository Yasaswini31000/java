public class StringDigitSum
{
public static void main(String[] args)
{
String str="java program no12345abcdef";
int sum=0;
for(int i=0;i<str.length();i++){
if(str.charAt(i)>=48 && str.charAt(i)<=57){
sum+=str.charAt(i);
System.out.println(sum);
}
}
System.out.println(sum);
}   
}
