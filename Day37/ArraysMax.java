public class ArraysMax
{
public static void main(String args[])
{
int n=4518;
int max=0;
int place=1;
while(n/place>0)
{
int num=n/(place*10)*place+n%place;
System.out.println(num);
if(num>max)
max=num;
place*=10;
}
}
}

