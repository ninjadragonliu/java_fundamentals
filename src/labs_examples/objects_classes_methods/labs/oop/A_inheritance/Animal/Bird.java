package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

class Bird extends Animal
{
    private String color;

    public Bird(String name, String sound) {
        super(name, sound);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String noise() {
        return "Bird " + super.getName() + " says " + super.getSound();
    }
}