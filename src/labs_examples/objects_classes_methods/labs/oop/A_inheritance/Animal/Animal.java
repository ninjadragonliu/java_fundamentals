package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

class Animal
{
    private String name;
    private String sound;


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

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    public void Speak()
    {
        System.out.println(name + " says " + sound);
    }
}



