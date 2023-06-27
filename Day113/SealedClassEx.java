public class SealedClassEx {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Four Wheeler");
        Bike b = new Bike();
        System.out.println("Two wheeler");

    }
}
sealed class Vehicle permits Car,Bike,Bus {
    int wheels;
    double price;
    String speed;
    String mileage;
    double length;
}
non-sealed class Car extends Vehicle {
    double speedOfEngine(String fuel) {
        return speed;
    }
}
non-sealed class Bike extends Vehicle {
    String horsePower(double speed) {
        return mileage;
    }
}
final class Bus extends Vehicle {
    double noOfPassengers(String seats) {
        return (2 * seats);
    }
}
