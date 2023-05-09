import java.io.*;
public class TryWithResourceEx {

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("Example/rock1.txt")) {

            String str = "hello world";

            byte arr[]  = str.getBytes(); //converting String to byte

            fos.write(arr);

            fos.flush();
        } catch(Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
