@FunctionalInterface
interface MaxNum{

    double maximum(double x,double y);

}
public class MethodReferenceMax {
    public static void main(String[] args) {

        MaxNum maxNum = Math::max;

        double res =maxNum.maximum(11, 33);

        System.out.println(res);

    }

}
