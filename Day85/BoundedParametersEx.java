public class BoundedParametersEx {
    public static void main(String[] args) {

        getNumber(108);

        getNumber(11222.3333);

        getNumber(1234.06f);

        getNumber(12345678L);
    }

    public  static<N extends Number> void getNumber(N num) {

        System.out.println(num);

    }
}
