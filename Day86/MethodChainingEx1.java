public class MethodChainingEx1 {
    public static void main(String[] args) {

        String name = "Harry Potter";

        boolean res1 = name.toUpperCase().isEmpty();

        System.out.println(res1);

        boolean res2 = name.replace("H","h").startsWith("H");

        System.out.println(res2);
    }
}
