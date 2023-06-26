public class DeepCopyEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.a = 10;
        s.b = 20;
        Student s1 = new Student();
        s1.a=s.a;
        s1.b=s.b;
        System.out.println(s1.a);
        System.out.println(s.a);
        s1.a=30;
        System.out.println(s1.a);
        System.out.println(s.a);
    }
}
class Student {
    int a;
    int b;
}