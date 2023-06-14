import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {

        try {

            FileWriter fileWriter = new FileWriter("Rock.txt");

            fileWriter.write("welcome to java....!");

            fileWriter.close();

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}