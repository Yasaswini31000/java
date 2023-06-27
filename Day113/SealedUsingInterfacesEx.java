public class SealedUsingInterfacesEx {
    public static void main(String[] args) {
        Car c = new Car();
        c.wheels();
        Bike b = new Bike();
        b.wheels();
    }
}
sealed interface Vehicle permits Car,Bike {
    public void wheels();
}
final class Car implements Vehicle {
    @Override
    public void wheels() {
        System.out.println("Car is a four wheeler");
    }
}

non-sealed class Bike implements Vehicle {
    @Override
    public void wheels() {
        System.out.println("Bike is a two wheeler");
    }
}
