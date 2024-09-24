package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public class Agumon extends Digimon{

    public Agumon() {
        super("Agumon", "Vaccine", 100, 30, 20, 15);
        this.addAttack(new Attack("Pepper Breath", 30));
        this.addAttack(new Attack("SpitFire", 40));
    }

    @Override
    public void attack(Digimon digimon) {

    }
}
