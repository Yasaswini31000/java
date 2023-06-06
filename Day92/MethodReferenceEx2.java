@FunctionalInterface
interface Qwack{

    void display(String str);
}
public class MethodReferenceEx2 {
    public static void main(String[] args) {

        Qwack q1 = System.out::println;

        q1.display("hello java");
    }
}
