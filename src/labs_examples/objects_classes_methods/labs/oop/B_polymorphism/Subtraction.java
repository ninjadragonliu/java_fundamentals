package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Subtraction {
    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public double subtract(double a, double b) {
        return a - b;
    }
}

class SubtractionDemo {
    public static void main(String args[]) {
        Subtraction obj = new Subtraction();
        int a = 15, b = 10, c = 5;
        double d = 15.5, e = 10.5;
        System.out.println("Subtraction of " + a + " and " + b + " is " + obj.subtract(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " and " + c + " is " + obj.subtract(a, b, c));
        System.out.println("Subtraction of " + d + " and " + e + " is " + obj.subtract(d, e));
    }
}
