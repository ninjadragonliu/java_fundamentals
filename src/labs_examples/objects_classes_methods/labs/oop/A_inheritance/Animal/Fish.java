package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

class Fish extends Animal
{
    private int length;

    public Fish(String name, String sound) {
        super(name, sound);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public String noise() {
        return "Fish " + super.getName() + " says " + super.getSound();
    }
    public void swim() {
        System.out.println("Fish " + super.getName() + " is swimming");
    }
}