@FunctionalInterface
interface Jack {

    void hey(int x,int y);

}

public class MethodReferenceEx1 {
    public static void main(String[] args) {

        Jack j1 = Rock1 :: new;

        j1.hey(11,33);

    }
}

class Rock1 {

    Rock1() {

        System.out.println("Duck");

    }

    Rock1(int x,int y) {

        System.out.println(x+y);

    }
}
