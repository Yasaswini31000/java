public class DeprecatedEx {
        public static void main(String[] args) {

            John j1 = new John();

            j1.previousmethod();
        }
    }

    class John {
    @Deprecated
    public void previousmethod() {

        System.out.println("This is a deprecated method......!");
    }

}
