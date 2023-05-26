public class FindCircleArea {

    //static int x=10;
    public static void main(String[] args) {

        Circle c1 = (r) -> Math.PI*(r*r);

        double res = c1.area(3.05);

        System.out.println(res);
    }
}
interface Circle {

    double area(double r);
}
