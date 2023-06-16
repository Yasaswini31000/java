import java.io.Serializable;

class SoftwareEngineer implements Serializable {
    static String name;
    transient int age;
    static double salary; // static variables are not serializable, they returns default value

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

