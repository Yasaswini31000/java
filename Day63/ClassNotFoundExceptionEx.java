public class ClassNotFoundExceptionEx {
    public static void main(String args[]) {
        try {
            Class.forName("No class Exists here");
        }
        catch(ClassNotFoundException e) {
           e.printStackTrace();
        }
    }
}
