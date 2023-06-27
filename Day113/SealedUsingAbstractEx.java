public class SealedUsingAbstractEx {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        Pulsar p = new Pulsar();
        p.drive();
    }
}
sealed abstract class Vehicle permits Car,Bike {
    void drive() {
        System.out.println("There are various kinds of vehicles");
    }
}
non-sealed class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("car is a four wheeler");
    }
}
sealed abstract class Bike extends Vehicle {

}
final class Pulsar extends Bike {
    void drive() {
        System.out.println("bike is two wheeler");
    }
}