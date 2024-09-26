package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class Garurumon extends Digimon{

    public Garurumon() {
        super("Garurumon", "Data", 125, 45, 45, 30);
        this.addAttack(new Attack("Howling Blaster", 40));
        this.addAttack(new Attack("Freeze Fang", 35));
    }

    @Override
    public void attack(Digimon target, Attack chosenAttack) {

    }

    @Override
    public Digimon digivolve() {
        System.out.println(this.name + " is digivolving into WereGarurumon!");
        return new WereGarurumon();
    }
}
