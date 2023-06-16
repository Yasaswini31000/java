import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ObjectInputStreamEx {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("Rock.txt");

            ObjectInputStream os = new ObjectInputStream(fis);

            SoftwareEngineer se = (SoftwareEngineer) os.readObject();

            System.out.println(se);

            System.out.println(se.name);

            System.out.println(se.age);

            System.out.println(se.salary);

            se.sayHi();
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
