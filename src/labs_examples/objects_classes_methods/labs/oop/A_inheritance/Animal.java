package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Animal
{
    private String name;
    private String sound;
    public Animal()
    {

    }
}

class Bird extends Animal
{
    private String color;
}
class Fish extends Animal
{
    private int length;
}