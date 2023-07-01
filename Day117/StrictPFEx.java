public class StrictPFEx {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sub());
        //we can't use strictpf for other variable.
    }
    static strictfp double sum() {
        double num1 = 125.4556765;
        double num2 = 112.654323;
        return  num1+num2;
        //we can use strictpf for methods.
    }
    static  strictfp double sub() {
        double num1 = 10e+123;
        double num2 = 8e+34;
        return num1 - num2;
    }
}
