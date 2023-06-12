
import java.io.*;

import java.util.Scanner;

    public class FileIOStreamsEx {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            byte[] array;

            try {

                FileInputStream inputStream = new FileInputStream("Hello.txt");

                System.out.print("Enter the name of your copy: ");

                String str = sc.next();

                FileOutputStream outputStream = new FileOutputStream(str + "Hello.txt");

                array = new byte[inputStream.available()];

                inputStream.read(array);

                String s = new String(array);

                byte[] array1 = s.toUpperCase().getBytes();

                outputStream.write(array1);

                inputStream.close();

                outputStream.close();

            } catch (Exception e) {

                e.getStackTrace();

            }

            sc.close();
        }
    }


