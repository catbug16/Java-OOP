
abstract class Vehicle {
    public abstract void start();
}


class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}


class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();   // Output: Car is starting
        bike.start();  // Output: Bike is starting
    }
}
