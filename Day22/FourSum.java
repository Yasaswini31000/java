//program on check four sum 
public class FourSum
{
public static void main(String args[])
{
int arr[]={2,4,6,8,10,3,5,7,9,1,15,7,12,11};
int sum=17;
int n=arr.length;
for(int i=0;i<n-3;i++)
{
for(int j=i+1;j<n-2;j++)
{
for(int l=j+1;l<n-1;l++)
{
for(int k=l+1;l<n;l++)
{
if(arr[i]+arr[j]+arr[l]+arr[k]==sum)
{
System.out.println(arr[i]+" "+arr[j]+" "+arr[l]+" "+arr[k]);
}
}
}
}
}
}
}

