package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Vehicle {
    void go() {
        System.out.println("The vehicle is moving");
    }
}
class Car extends Vehicle {
    void go() {
        System.out.println("The car is moving");
    }
}
class Plane extends Vehicle {
    void go() {
        System.out.println("The plane is moving");
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.go();
        Vehicle plane = new Plane();
        plane.go();
    }
}