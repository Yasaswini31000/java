public class IllegalArgumentExceptionsEx {
    int age;

    public void setAge(int age) throws IllegalArgumentException {
        if (age < 0) {

            throw new IllegalArgumentException("Age must be greater than zero");

        } else {

            this.age = age;

            System.out.println(this.age);
        }
    }

    public static void main(String[] args) {

        IllegalArgumentExceptionsEx person = new IllegalArgumentExceptionsEx();

        try {

            person.setAge(-6);

        } catch (IllegalArgumentException e) {

            System.out.println(e);
        }
    }
}
