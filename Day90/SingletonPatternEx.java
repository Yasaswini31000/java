public class SingletonPatternEx {
    public static void main(String[] args) {

        //Rock r = new Rock(); //This Rock class contains constructor which is private,we can't specify it out side of the class

        System.out.println(Rock.a);

        System.out.println(Rock.getRock());

        Rock.getRock().singletonPattern();

    }
}
class Rock {

    static int a = 108*108*108;

    private static Rock x = new Rock();

    private Rock() {

    }

    public static Rock getRock() {

        return x;

    }
    public void singletonPattern() {

        System.out.println("Java Program...");
    }
}