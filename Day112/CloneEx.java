public class CloneEx {
    public static void main(String[] args) throws CloneNotSupportedException {

        Subtraction sub = new Subtraction();

        sub.a = 10;

        sub.b = 20;

        Subtraction s1 = (Subtraction) sub.clone();

        System.out.println(s1.a);

        System.out.println(s1.b);
    }
}
class Subtraction implements Cloneable {
    int a;
    int b;
    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
