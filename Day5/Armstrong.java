import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1,n2,n3,sum;
for(int i=1;i<=500;i++)
{
temp=i;
digit=temp%10;
sum=sum+digit*digit*digit;
temp/=10;
}
if(sum==i)
System.out.print(i+"\nis an armstrong number");
}
}
}

