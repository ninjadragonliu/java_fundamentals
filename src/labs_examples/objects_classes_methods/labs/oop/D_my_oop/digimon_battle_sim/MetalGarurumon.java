package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class MetalGarurumon extends Digimon {

    public MetalGarurumon() {
        super("MetalGarurumon", "Vaccine", 300, 75, 75, 55);
        this.addAttack(new Attack("Fire", 50));
        this.addAttack(new Attack("Great Horn Attack", 60));
    }

    @Override
    public void attack(Digimon target, Attack chosenAttack) {
        System.out.println(this.name + " uses " + chosenAttack.getName() + "!");
        target.defend(chosenAttack.getDamage());
    }

    @Override
    public Digimon digivolve() {
        return null;
    }
}
