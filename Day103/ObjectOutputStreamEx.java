import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class ObjectOutputStreamEx {
    public static void main(String[] args)  {
        SoftwareEngineer1 se = new SoftwareEngineer1();

        se.name="Rocky";

        se.age=26;

        se.salary=50000.00;

        try {
            FileOutputStream fos = new FileOutputStream("Rock.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(se);

            long serialEx1 = ObjectStreamClass.lookup(se.getClass()).getSerialVersionUID(); // returns the unique id of the class

            System.out.println(serialEx1);
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
class SoftwareEngineer1 implements Serializable {
    String name;
    transient int age; // if we use transient for variable,it is not serializable, it will return the default value
    static double salary; // static variables are not serializable they returns default value

    void sayHi() {
        System.out.println("hi "+this.name);
    }
    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
