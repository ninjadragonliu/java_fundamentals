package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class WereGarurumon extends Digimon{

    public WereGarurumon() {
        super("WereGarurumon", "Data", 195, 55, 55, 40);
        this.addAttack(new Attack("Howling Blaster", 40));
        this.addAttack(new Attack("Freeze Fang", 35));
    }

    @Override
    public void attack(Digimon target, Attack chosenAttack) {
        //System.out.println(this.name + " uses " + chosenAttack.getName() + "!");
        target.takeDamage(chosenAttack.getDamage());
    }

    @Override
    public Digimon digivolve() {
        System.out.println(this.name + " is digivolving into MetalGarurumon!");
        return new MetalGarurumon();
    }
}
