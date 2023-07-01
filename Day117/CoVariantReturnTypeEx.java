public class CoVariantReturnTypeEx {
    public static void main(String[] args) {

        Rock r = new Rock();

        r.hello();

        Duck d = new Duck();

        d.hello();
    }
}
class Main {
}
class Hii extends Main {
}
class Rock {
    Main hello()
            {
                System.out.println("Hello java");

                return new Main();
            }
        }
        class Duck extends Rock {
            @Override
            Hii hello()
            {
                System.out.println("Hello world");

                return new Hii();
            }
}