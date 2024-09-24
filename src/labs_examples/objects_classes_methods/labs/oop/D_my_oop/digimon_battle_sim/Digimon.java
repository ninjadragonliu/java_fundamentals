package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public abstract class Digimon {

    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int speed;
    protected int level;
    protected int experience;

    public Digimon(String name, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.level = level;
        this.experience = experience;
    }
    public abstract void attack(Digimon digimon);

    public abstract void defense(Digimon digimon);

    public void takeDamage(int damage) {
        hp -= damage;

        if (hp < 0) {
            hp = 0;
            System.out.println(name + " has been defeated!");
        }
    }

    public int getHp() {
        return hp;
    }

}
