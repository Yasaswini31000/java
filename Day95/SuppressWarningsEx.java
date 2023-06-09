class SuppressWarningsEx {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        Duck d1 = new Duck(); // we are not using this duck variable so warnings raises, this can be prevented by using SuppressWarnings annotation

    }
}
class Duck {

    void run() {

        System.out.println("Duck");

    }

}