public class SafeVarArgsEx {
    public static void main(String[] args)
    {
        Maths<Integer> sv1 = new Maths<>();

        Integer[] arr = {3,4,5};

        sv1.showman(arr);
    }
}
class Maths<T> {

    @SafeVarargs // to avoid warning of heap pollution from parameterized vararg type

    final void showman(T... args) {

        for(T x: args) {

            System.out.println(x);

        }
    }

}
