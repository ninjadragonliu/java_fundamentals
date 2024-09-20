package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

public abstract class Digimon {

    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int level;
    private int experience;
    private int maxHp;
    private int maxAttack;
    private int maxDefense;
    private int maxSpeed;
    private int maxLevel;
    private int maxExperience;

    public Digimon(String name, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.level = level;
        this.experience = experience;
        this.maxHp = hp;
        this.maxAttack = attack;
        this.maxDefense = defense;
        this.maxSpeed = speed;
        this.maxLevel = level;
        this.maxExperience = experience;
    }

}
