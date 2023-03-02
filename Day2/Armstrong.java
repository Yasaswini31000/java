import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("Enter one number:");
int n1=s.nextInt();
System.out.print("Enter another number:");
int n2=s.nextInt();
int temp,digit,sum;
for(int i=n1;i<n2;i++)
{
temp=i;
sum=0;
while(temp!=0)
{
digit=temp%10;
sum=sum+digit*digit*digit;
temp/=10;
}
if(sum==i)
System.out.print(i+"\nis an armstrong number");
}
}
}

