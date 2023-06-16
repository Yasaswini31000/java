import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.FileNotFoundException;

public class SerialEx1 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("Rock.txt");

            ObjectInputStream os = new ObjectInputStream(fis);

            SoftwareEngineer se = (SoftwareEngineer) os.readObject();

            System.out.println(ObjectStreamClass.lookup(se.getClass()));
        }
         catch (Exception e) {

            e.printStackTrace();
        }
    }
}