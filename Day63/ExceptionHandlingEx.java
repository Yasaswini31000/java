public class ExceptionHandlingEx {
    public static void main(String args[]) {
        try {

        }
        catch(Exception e) {
           System.out.println("Exception handled in main");
        }
    }
    static int rock(int a,int b) throws ArithmeticException {
        int r=divide(a,b);//implementing throws keyword
        return 10;
    }
    static int divide(int c,int d) throws ArithmeticException {
        if(d==0)
            throw new ArithmeticException("/ by zero");//implementing throw keyword
        return c/d;
    }
}
