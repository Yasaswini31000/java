public class NumberFormatExceptionEx {
    public static void main(String args[]) {
        Duck d = new Duck();
        try {
            int x = Integer.parseInt(d.s);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }

    }
}
class Duck {
        String s;
        int a;
}

