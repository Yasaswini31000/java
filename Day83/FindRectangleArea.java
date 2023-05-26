public class FindRectangleArea {
        public static void main(String[] args) {

            Rectangle r1 = (l,b) -> Math.PI*(l*b);

            double res = r1.area(4.15,5.15);

            System.out.println("Aea of Rectangle : ");

            System.out.println(res);
        }
    }
    interface Rectangle {

        double area(double x,double y);
    }

