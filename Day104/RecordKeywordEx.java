import java.util.Objects;
public class RecordKeywordEx {
    public static void main(String[] args) {

        Rock r1 = new Rock("Ravi kumar",26);

        r1.sayHi();

        System.out.println(r1.age());
    }
}
class Rock1 {
    private  String name;
    private  int age;
    Rock1() {

    }
    Rock1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Rock1 r))
            return false;
        return getAge() == r.getAge() && Objects.equals(getName(), r.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
    @Override
    public String toString() {
        return "Rock {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
