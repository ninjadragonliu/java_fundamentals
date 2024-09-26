package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class WereGarurumon extends Digimon{

    public WereGarurumon() {
        super("WereGarurumon", "Data", 125, 45, 45, 30);
        this.addAttack(new Attack("Howling Blaster", 40));
        this.addAttack(new Attack("Freeze Fang", 35));
    }

    @Override
    public void attack(Digimon target, Attack chosenAttack) {

    }

    @Override
    public Digimon digivolve() {
        return null;
    }
}
