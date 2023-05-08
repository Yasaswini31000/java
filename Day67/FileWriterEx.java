import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        File file = new File("Example/rock1.txt");
        file.createNewFile();
        FileWriter fw=new FileWriter(file,true);
        fw.write("Hi...Yashu");
        fw.flush();
        fw.close();
    }
}
