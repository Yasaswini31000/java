public class ConcreteMethodsInInterfacesEx implements MyInterface{
    public static void main(String[] args) {

        ConcreteMethodsInInterfacesEx c1= new ConcreteMethodsInInterfacesEx();

        c1.defaultMethod();

    }

}
interface MyInterface {

    default void defaultMethod() {

        System.out.println("Default Method");

    }

    static void staticMethod() {

        System.out.println("static method");
    }

}


