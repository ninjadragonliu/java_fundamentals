package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

interface Fly
{
    void fly();
}

class Bird implements Fly
{
    @Override
    public void fly()
    {
        System.out.println("Bird is flying");
    }
}
class Plane1 implements Fly
{
    @Override
    public void fly()
    {
        System.out.println("Plane is flying");
    }
}
public class InterfaceDemo2 {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        Plane1 plane = new Plane1();
        plane.fly();
    }
}
