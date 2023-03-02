import java.util.*;
public class ASCII
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any character for ASCII value:");
char ch=sc.next().charAt(0);
int value=ch;
System.out.println("Character is"+ch+"and ASCII value is"+value);
}
}
