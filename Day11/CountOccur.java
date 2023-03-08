import java.util.Arrays;
public class CountOccur
{
public static void main(String args[])
{
int arr[]={1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
int n=arr.length;
int x=3,freequency=0;
for(int i=0;i<n;i++)
{
if(arr[i]==x)
freequency++;
if(arr[i]>x)
break;
}
System.out.println("Count of Occurance:"+freequency);
}
}

