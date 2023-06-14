import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {

        try{

            FileReader fileReader = new FileReader("Duck.txt");

            BufferedReader br = new BufferedReader(fileReader);

            System.out.println(br.markSupported());

            br.mark(4);

            br.reset();

            System.out.println((char)br.read());

            br.close();

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}
