import java.util.HashSet;
import java.util.Iterator;

public class PassingObjects {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student();
        s1.setRno(101);
        s1.setName("John");
        Student s2 = new Student();
        s2.setRno(102);
        s2.setName("David");
        set.add(s1);
        set.add(s2);
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
class Student {
    private int rno;
    private String sname;
    public int getRno() {
        return rno;
    }
    public void setRno(int rno) {
        this.rno = rno;
    }
    public String getName() {
        return sname;
    }
    public void setName(String name) {
        this.sname = sname;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + sname + '\'' +
                '}';
    }
}
