package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

class Animal
{
    private String name;
    private String sound;
    private int speed;

    public Animal(String name, String sound)
    {
        this.name = name;
        this.sound = sound;
    }

    public String getName()
    {
        return name;
    }

    public String getSound()
    {
        return sound;
    }
    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public String noise()
    {
        return "Animal " + name + " says " + sound;
    }
    public String move()
    {
        return "Animal " + name + " moves with speed " + speed;
    }
}



