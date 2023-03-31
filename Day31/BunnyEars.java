public class BunnyEars
{
public static void main(String args[])
{
int bunnies=5;
int res=bunnyEars(bunnies);
System.out.println(res);
}
static int bunnyEars(int bunnies)
{
if(bunnies==0)
return 0;
int res=2+bunnyEars(bunnies-1);
return res;
}
}

