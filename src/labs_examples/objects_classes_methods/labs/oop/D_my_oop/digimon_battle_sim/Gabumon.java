package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class Gabumon extends Digimon {
    public Gabumon() {
        super("Gabumon", "Data", 100, 30, 25, 10);
        this.addAttack(new Attack("Blue Blaster", 30));
        this.addAttack(new Attack("Horn Attack", 40));
    }


    @Override
    public void attack(Digimon target, Attack chosenAttack) {
        //System.out.println(this.name + " uses " + chosenAttack.getName() + "!");
        target.defend(chosenAttack.getDamage());
    }

    @Override
    public Digimon digivolve() {
        System.out.println(this.name + " is digivolving into Garurumon!");
        return new Garurumon();
    }
}
