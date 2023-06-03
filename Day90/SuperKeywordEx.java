public class SuperKeywordEx {
    public static void main(String[] args) {

        Dog d1 = new Dog(5);

    }
}
class Animal {

    Animal() {

        System.out.println("Default parent constructor");

    }

    Animal(int x) {

        System.out.println("parent one constructor");

    }
    Animal(int x, int y) {

        System.out.println("parent two constructor");

    }
}
class Dog extends Animal {

    Dog() {

        super();

        System.out.println("Default child constructor");
    }

    Dog(int x) {

        super(20, 30);

        System.out.println("child one constructor");
    }

    Dog(int x, int y) {

        System.out.println("child two constructor");
    }
}
