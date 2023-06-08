
import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class ReflectionEx {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

            Jack j1 = new Jack();
            Class c = j1.getClass();
            Annotation a = c.getAnnotation(VIP.class); // checking whether the class contains VIP annotation or not
            VIP vip = (VIP) a;
            System.out.println(((VIP) a).rating()); // getting the ratings of VIP
            System.out.println(((VIP) a).star()); // getting the star of VIP

    }
}
    @VIP(rating = 5, star = "Gold")
    class Jack {

        String name;
        Jack(String name) {
            this.name = name;
        }
        Jack() {

        }
        void printVIP() {
            System.out.println(name.toUpperCase());
        }
        void print() {
            System.out.println(name);
        }

    }
    class Rock1 {
        String name;
        Rock1(String name) {
            this.name = name;
        }
        Rock1() {

        }
        void printVIP() {
            System.out.println(name.toUpperCase());
        }
        void print() {
            System.out.println(name);
        }
    }
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @interface VIP {
        int rating() default 1;
        String star();
    }



