import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        File file = new File("Example/rock1.txt");
        FileReader reader = new FileReader(file);
        System.out.println(reader.read());
        reader.close();

    }
}
