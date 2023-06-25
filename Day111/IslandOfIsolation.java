public class IslandOfIsolation {
    public static void main(String[] args) {

        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.name = new Student1();
        System.out.println(s1.name.rollNo);
        s2 = null;
        System.out.println(s1.name.rollNo);
        s1.name.name = new Student1();
        s1.name.name.rollNo = 5;
        System.out.println(s1.name.name);
    }
}
class Student1 {
    int rollNo;
    Student1 name;
    @Override
    public String toString() {
        return "Student3{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}