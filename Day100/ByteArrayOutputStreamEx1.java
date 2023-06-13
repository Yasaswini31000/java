import java.io.*;

public class ByteArrayOutputStreamEx1 {
    public static void main(String[] args)throws Exception {

        FileOutputStream fos1 = new FileOutputStream("hello.txt");

        FileOutputStream fos2 = new FileOutputStream("Rock.txt");

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        bos.write(108);

        bos.writeTo(fos1);

        bos.writeTo(fos2);

        bos.flush();

        bos.close();
    }
}
