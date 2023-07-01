import java.util.Optional;
public class OptionalClassEx {
    public static void main(String[] args) {

        printUpperCase(Optional.ofNullable(null));
    }
    public  static  void printUpperCase(Optional<String> name) {

        if(name.isEmpty())

            System.out.println("null");

        else

            System.out.println(name.get());

        name.ifPresentOrElse(n-> System.out.println(n.length()),()-> {

             System.out.println("0");
        });

    }
}