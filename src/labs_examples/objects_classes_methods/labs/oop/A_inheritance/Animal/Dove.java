package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

class Dove extends Bird
{
    private String habitat;

    public Dove(String name, String sound) {
        super(name, sound);
    }

    @Override
    public String noise() {
        return "Dove " + super.getName() + " says " + super.getSound();
    }
    @Override
    public void fly() {
        System.out.println("Dove " + super.getName() + " is flying");
    }
}