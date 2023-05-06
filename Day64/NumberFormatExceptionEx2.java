public class NumberFormatExceptionEx2 {
    public static void main(String args[]) {

        int arr[]=new int[5];
        Duck1 d = new Duck1();
        try {
            int x = Integer.parseInt(d.s);
            int y = arr[6];
        } catch (NumberFormatException |ArrayIndexOutOfBoundsException e) {
            System.out.println("Number Format or array out of bounds Exception");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
class Duck1 {
    String s="1234";
    int a;
}
