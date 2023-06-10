import java.lang.annotation.*;
@Student(name="Harry" )
@Student(name="Harmonie")
@Student(name="Ron")
public class RepeatableAnnotationsEx {
    public static void main (String[] args) {
        // Retrieve annotations by type, i.e., Student
        // Returns an array
        Student[] annotations=RepeatableAnnotationsEx.class.getAnnotationsByType(Student.class);
        for (Student s1 : annotations) {
            System.out.println(s1);
        }
        Student stu = RepeatableAnnotationsEx.class.getAnnotation(Student.class);
        for(Student s1 :stu.value())

        {
            System.out.println(s1.name());
        }
    }
}

