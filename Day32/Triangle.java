public class Triangle
{
public static void main(String args[])
{
int rows=5;
System.out.println(triangle(rows));
}
static int triangle(int rows)
{
if(rows==0||rows==1)
return rows;
else
return rows+triangle(rows-1);
}
}

