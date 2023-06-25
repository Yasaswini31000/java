import java.io.FileNotFoundException;
public class FinalizeEx {
    public static void main(String[] args) throws  Exception {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3  = new Student();
        s3=null;
        System.gc();
        Runtime.getRuntime().gc();
        Student s4 = new Student();
    }
}
class Student {
    static  int id;
    Student() throws FileNotFoundException {
        id = id+1;
        System.out.println(id);
    }
    @Override
    protected void finalize() throws Throwable {
        id = id-1;
    }
}
