import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx1 {
    public static void main(String[] args) {

        byte[] b1 = {'a','e','i','o','u'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b1);

        System.out.println((char)bis.read());

        System.out.println(bis.markSupported());

        bis.mark(2);

        System.out.println((char)bis.read());

        System.out.println((char)bis.read());

        bis.reset();

        System.out.println((char)bis.read());
    }
}
