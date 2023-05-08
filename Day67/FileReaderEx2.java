import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class FileReaderEx2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/rock.txt");
        FileReader reader = new FileReader(file);
        int x=reader.read();
        while(x!=-1) {
            System.out.println((char) x);
            x = reader.read();
        }
        reader.close();
    }
}

