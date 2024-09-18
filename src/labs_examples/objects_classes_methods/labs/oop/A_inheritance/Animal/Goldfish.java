package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

class Goldfish extends Fish
{
    private String habitat;

    public Goldfish(String name, String sound) {
        super(name, sound);
    }
    @Override
    public void Speak()
    {
        System.out.println("Goldfish " + super.getName() + " says " + super.getSound());
    }
    @Override
    public void swim() {
        System.out.println("Goldfish " + super.getName() + " is swimming");
    }
}