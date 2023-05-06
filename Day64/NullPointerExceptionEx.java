public class NullPointerExceptionEx {
    public static void main(String args[]) {
        String str = null;

         // throws NullPointerExceptions

        try {

            System.out.println(str.length());
        }
        catch (Exception e) {

            e.printStackTrace();
        }
        Rock r = new Rock();
        System.out.println(r.x.length());

    }
}
class Rock {
    String x;
}
