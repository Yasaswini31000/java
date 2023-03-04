import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n1,n2,n3,sum,temp;
for(int i=1;i<=500;i++)
{
temp=i;
n1=temp%10;
temp=temp/10;
n2=temp%10;
temp=temp/10;
n3=temp%10;
if((n1*n1*n1+n2*n2*n2+n3*n3*n3)==i){
System.out.println(i);
}
}
}
}

