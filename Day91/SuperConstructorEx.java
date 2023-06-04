public class SuperConstructorEx {
    public static void main(String[] args) {

        Duck d1 = new Duck();
    }
}
class Hello {
    Hello() {
//As default super() constructor is in the child class constructors,when we call it ,
// then the parent class default constructor will be called.

        System.out.println("Hello");
    }
}
class Jack extends Hello {
    Jack() {
        System.out.println("Jack");
    }
}
class Duck extends Jack {
    Duck() {

        System.out.println("Duck");
    }

}
