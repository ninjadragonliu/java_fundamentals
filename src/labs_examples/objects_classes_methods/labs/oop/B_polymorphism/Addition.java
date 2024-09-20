package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
class OverloadingDemo {
    public static void main(String[] args) {
        Addition math = new Addition();
        System.out.println("Add two integers: 5 + 10 = " + math.add(5, 10));
        System.out.println("Add three integers: 5 + 10 + 15 = " + math.add(5, 10, 15));
        System.out.println("Add two doubles: 5.5 + 10.5 = " + math.add(5.5, 10.5));
    }
}