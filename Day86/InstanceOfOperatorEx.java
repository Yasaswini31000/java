public class InstanceOfOperatorEx {
    public static void main(String[] args) {

        Animal pet = new Cat();

        boolean res = pet instanceof Cat;

        System.out.println(res);

        res = pet instanceof Dog;

        System.out.println(res);

        Animal pet1 = new Dog();

        res = pet1 instanceof Dog;

        System.out.println(res);

        res = pet1 instanceof Cat;

        System.out.println(res);

        Animal pet2 = new Animal();

        res = pet2 instanceof Animal;

        System.out.println(res);

    }
}

class Animal {
    //int x = 100;

}
class Cat extends Animal {

}

class Dog extends Animal {

}

