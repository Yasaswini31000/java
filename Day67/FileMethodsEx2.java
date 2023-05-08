import java.io.File;
import java.io.IOException;
public class FileMethodsEx2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/rock.txt");
        File file2 = new File("src/duck.txt");
        System.out.println(file.length());
        System.out.println(file.length()/1000.0);
        System.out.println(file.isFile());
        System.out.println(file2.isFile());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.length());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.exists());
    }
}
