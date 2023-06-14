import java.io.*;
import java.io.FileNotFoundException;
public class BufferedWriterEx {
    public static void main(String[] args) {

        try {

            FileWriter fileWriter = new FileWriter("Duck.txt");

            BufferedWriter bw = new BufferedWriter(fileWriter);

            bw.write("hello world");

            bw.close();

        } catch(Exception e) {

            e.printStackTrace();

        }
    }

}
