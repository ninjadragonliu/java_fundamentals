package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class MetalGreymon extends Digimon{

    public MetalGreymon() {
        super("MetalGreymon", "Vaccine", 150, 50, 25, 25);
        this.addAttack(new Attack("Nova Blast", 50));
        this.addAttack(new Attack("Great Horn Attack", 60));
    }

    @Override
    public void attack(Digimon target, Attack chosenAttack) {

    }
}
