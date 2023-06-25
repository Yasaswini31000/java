public class UnreachableObjectsEx {
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2 = null; // It is eligible for garbage collection
    }
}
class Student2 {
    int rollNo;
    String name;
}