import java.util.*;
public class Palindrome
{
public static void main(String args[])
{
int x,num,y=0,temp=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter any number:");
num=sc.nextInt();
x=num;
while(num>0)
{
x=num%10;
num=num/10;
temp=temp*10+x;
}
if(temp==y)
{
System.out.print("Palindrome");
}
else
{
System.out.print("Not Palindrome");
}
}
}
