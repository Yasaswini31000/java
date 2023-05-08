import java.io.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class PrintWriterEx {
    public static void main(String[] args) throws IOException {
        File file = new File("Example/rock1.txt");
        FileWriter fw=new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(true);
        pw.println(1234);
        pw.write("\nHi...Yashu");
        pw.append("hello world!");
        pw.close();
    }
}