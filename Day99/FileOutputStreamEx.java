import java.io.FileOutputStream;
public class FileOutputStreamEx {
    public static void main(String[] args)
    {
        try {
            FileOutputStream output = new FileOutputStream("Rock.txt");

            String str = "hello world....!";

            byte[] array = str.getBytes();

            output.write(array);

            output.close();
        }
        catch (Exception e) {

            e.getStackTrace();
        }
    }
}

