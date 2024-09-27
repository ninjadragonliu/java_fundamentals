package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class MetalGarurumon extends Digimon {

    public MetalGarurumon() {
        super("MetalGarurumon", "Vaccine", 200, 65, 45, 35);
        this.addAttack(new Attack("Fire", 50));
        this.addAttack(new Attack("Great Horn Attack", 60));
    }
}
