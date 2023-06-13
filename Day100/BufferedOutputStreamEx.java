import java.io.*;
public class BufferedOutputStreamEx{
    public static void main(String[] args)throws Exception {

        FileOutputStream fos=new FileOutputStream("hello.txt");

        BufferedOutputStream bos=new BufferedOutputStream(fos);

        String s="Hello Java";

        byte b[]=s.getBytes();

        bos.write(b);

        bos.flush();

        bos.close();

        fos.close();

    }
}
