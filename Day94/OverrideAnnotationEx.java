public class OverrideAnnotationEx {
        public static void main(String[] args) {

            Rock r1 = new Rock();

            r1.printdata();
        }
    }

    class Rock{
    void printdata() {

            System.out.println("Rock");
        }
    }
    class Duck extends Rock {
    @Override
    void printdata() {

            System.out.println("Duck");
    }
}

