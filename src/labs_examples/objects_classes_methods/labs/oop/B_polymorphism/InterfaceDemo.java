package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw(); // Outputs: Drawing a Circle
        rectangle.draw(); // Outputs: Drawing a Rectangle
    }
}
