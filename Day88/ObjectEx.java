public class ObjectEx {
    public static void main(String[] args) {

        Nick nick = new Nick();

        System.out.println(nick.hashCode());
    }
}
class Duck {
}
class Nick extends Duck {
    int x;
}
class Rock extends Nick {
    int y;
}
