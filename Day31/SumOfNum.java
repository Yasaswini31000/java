public class SumOfNum
{
public static void main(String args[])
{
int num=10;
int res=sumofnum(num);
System.out.println(res);
}
static int sumofnum(int num)
{
if(num!=0)
return num+sumofnum(num-1);
else
return num;
}
}
