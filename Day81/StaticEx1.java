public class StaticEx1 {
    public static void main(String[] args) {
        Rock r1 = new Rock();
        Rock r2 = new Rock();
    }
}
class Rock {

    static {
        System.out.println("static block");
    }
    Rock() {
        System.out.println("Empty constructor");
    }

    {
        System.out.println("Initializer block");
    }
}

