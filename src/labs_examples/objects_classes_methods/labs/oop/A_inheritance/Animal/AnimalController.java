package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

public class AnimalController {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", "Sound");
        animal.setSpeed(10);
        System.out.println(animal.move());
        Bird bird = new Bird("Bird", "Sound");
        bird.setSpeed(20);
        System.out.println(bird.move());
        bird.fly();
        System.out.println(bird.noise());
    }
}
