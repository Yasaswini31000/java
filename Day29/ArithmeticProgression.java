 public class ArithmeticProgression
 {
 public static void main(String args[])
 {
 int arr[]={0,1,2,3,4,5};  
 int diff=arr[0]-arr[1];
 for(int i=0;i<arr.length-1;i++)
 {
 if(arr[i]-arr[i+1]==diff)
 {
 System.out.println("The array is in arithmetic progression");
 return;
 }
 else
 System.out.println("The Array is not in Arithmetic Progression");
 }
 }
 }
