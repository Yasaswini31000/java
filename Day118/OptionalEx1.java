import java.util.Optional;
public class OptionalEx1 {
    public static void main(String[] args) {

        Optional obj1 = Optional.of("This is a sample text");

        Optional obj2 = Optional.empty();

        if (obj1.isPresent()) {

            System.out.println("isPresent method called on obj1 returned true");
        }

        obj1.ifPresent(s -> System.out.println("ifPresent method called on obj1"));

        obj2.ifPresent(s -> System.out.println("ifPresent method called on obj2 "));

    }
}
