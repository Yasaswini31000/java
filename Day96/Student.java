import java.lang.annotation.*;
@Retention( RetentionPolicy.RUNTIME )
public @interface Student {
    Student[] value();
    String name = "Harry";

}