package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Execrise5Test {
    public static void main(String[] args)
    {
        Parent1 c = new Child1();
    }
}

class Parent1
{
    public Parent1()
    {
        System.err.println("Parent called");
    }
}

class Child1 extends Parent1
{
    public Child1()
    {
        System.err.println("Child called");
    }
}
