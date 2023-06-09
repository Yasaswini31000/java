import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
class TargetAnnotationEx {
    @isAProgram
    TargetAnnotationEx() {

    }

    @VIP // applying VIP annotation to methods
    public static void main(String[] args) {
        @SuppressWarnings("Unused")
            int a = 10;

        }
    }

    @Target(ElementType.CONSTRUCTOR) // we can apply this annotation only for constructor

    @interface isAProgram {

    }

    @Target({ElementType.TYPE,ElementType.METHOD,ElementType.LOCAL_VARIABLE}) // we can fix the access of annotation to multiple elements at a time

    @interface VIP {

}


