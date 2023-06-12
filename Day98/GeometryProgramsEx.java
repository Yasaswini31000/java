/**
 * author Harry
 */
import java.util.Scanner;
public class GeometryProgramsEx {
    /**
     * @param Area of a Geometry
     * @param Perimeter of a Geometry
     */


    public static void main(String[] args) {
        /**
         * to find area of geometry programs
         * to find area of geometry programs
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter side of a square :" + a);
        int l = sc.nextInt();
        System.out.println("Enter length of a rectangle :" + l);
        int b = sc.nextInt();
        System.out.println("Enter breadth of a rectangle :" + b);
        int r = sc.nextInt();
        System.out.println("Enter radius of a circle :" + r);
        int rad = sc.nextInt();
        System.out.println("Enter radius of a sphere :" + rad);
        int height = sc.nextInt();
        System.out.println("Enter height of a triangle :" + height);
        int base = sc.nextInt();
        System.out.println("Enter base of a triangle :" + base);
    }

class Area {

    /**
     *
     * @param Double geometry details
     * @return returns the area
     */
    double Square(Double a) {
        return (a * a);

    }

    double Rectangle(Double l, Double b) {
        return (l * b);

    }

     double Circle(Double r) {
        return (3.14 * r * r);

    }

    double Sphere(Double rad) {
        return (4 * 3.14 * rad * rad);

    }

    double Triangle(Double base, Double height) {
        return ((base * height) / 2);

    }
}
class Perimeter {
    /**
     *
     * @param Double geometry details
     * @return returns the perimeter
     */
    double Square(Double a) {
        return(4*a);

    }

    double Rectangle(Double l, Double b) {
        return (2*(l + b));

    }

    double Circle(Double r) {
        return (3.14 * 2 * r);

    }

    double Sphere(Double rad) {
        return (2 * 3.14 * rad);

    }
}
}

