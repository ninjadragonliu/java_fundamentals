package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Animal;

public class AnimalController {

    public static void main(String[] args) {

        Bird myBird = new Bird("Sunny", "Chirp");
        myBird.setColor("Yellow");
        myBird.Speak(); // Output: Bird Sunny says Chirp
        myBird.fly(); // Output: Bird Sunny is flying

        System.out.println();

        Dove myDove = new Dove("Dove", "Coo");
        myDove.setHabitat("River");
        myDove.Speak(); // Output: Dove Dove says Coo
        myDove.fly(); // Output: Dove Dove is flying

        System.out.println();

        Fish myFish = new Fish("Nemo", "Splash");
        myFish.setLength(10);
        myFish.Speak(); // Output: Fish Nemo says Splash
        myFish.swim(); // Output: Fish Nemo is swimming

        System.out.println();

        Goldfish myGoldfish = new Goldfish("Will", "Splash");
        myGoldfish.Speak(); // Output: Goldfish Nemo says Splash
        myGoldfish.swim(); // Output: Goldfish Nemo is swimming
    }
}
