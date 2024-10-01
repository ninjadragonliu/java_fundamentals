package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class Agumon extends Digimon{

    public Agumon() {
        super("Agumon", "Vaccine", 100, 30, 20, 15);
        this.addAttack(new Attack("Pepper Breath", 30));
        this.addAttack(new Attack("SpitFire", 40));
    }


    @Override
    public void attack(Digimon target, Attack chosenAttack) {
        //System.out.println(this.name + " uses " + chosenAttack.getName() + "!");
        target.defend(chosenAttack.getDamage());
    }

    @Override
    public Digimon digivolve() {
        System.out.println(this.name + " is digivolving into Greymon!");
        return new Greymon();
    }
}
