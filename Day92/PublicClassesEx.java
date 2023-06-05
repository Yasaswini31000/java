public class PublicClassesEx {
    static public void main(String[] args) {
        //Hello h1 = new Hello();
        Rock r1 = new Hello();
        System.out.println(r1.x);
    }
}
abstract class Rock {
    int x = 5;
}
class Hello extends Rock {

}
final class Host {
    
}