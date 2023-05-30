public class StackOverflowEx {

    static void marks() {

        System.out.println(100);

        passMarks();
    }
    static void passMarks() {

        System.out.println(30);

        marks();
    }
    public static void main(String[] args) {

        marks(); // stack overflow exception occurs here

    }
}
