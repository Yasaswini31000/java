public class MoveX
{
public static void main(String args[])
{
String str="xysxubxr";
System.out.println(moveX(str));
}
static String moveX(String str)
{
if(str.length()<2)
return "";
if(str.charAt(0)!='x')
return str.charAt(0)+moveX(str.substring(1));
else
return moveX(str.substring(1))+"x";
}
}

