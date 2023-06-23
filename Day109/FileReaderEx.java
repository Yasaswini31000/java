import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReaderEx {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("rock.java");
        //fr.write();
        //fr.read();
        //fr.close();

    }
    public static int findArea(Point p) {
        return p.x*p.y;
    }
}
