import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {
    public static void main(String[] args) throws FileNotFoundException {

        byte array[];

        try {

            FileInputStream inputStream = new FileInputStream("Hello.txt");

            array = new byte[inputStream.available()];

            System.out.println(inputStream.available());

            System.out.println( inputStream.read(array,0,4));

            System.out.println(inputStream.skip(0));

            System.out.println(inputStream.available());

            String str = new String(array);

            System.out.println(str);

            inputStream.close();

        }
        catch (Exception e) {

            e.getStackTrace();

        }
    }
}
