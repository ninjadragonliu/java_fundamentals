package labs_examples.objects_classes_methods.labs.oop.D_my_oop.digimon_battle_sim;

import java.util.ArrayList;

public abstract class Digimon {

    protected String name;
    protected String type;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int speed;
    protected int level;
    protected int experience;
    protected ArrayList<Attack> attacks;

    public Digimon(String name, String type, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;

        this.attacks = new ArrayList<>();
    }
    // Abstract method to attack
    public abstract void attack(Digimon target, Attack chosenAttack);

    // Method to defend
    public void defend(int damage) {
        int actualDamage = damage - this.defense;
        if (actualDamage > 0) {
            takeDamage(actualDamage);
        } else {
            System.out.println(this.name + " defended the attack!");
        }
    }
    // Method to add attacks
    public void addAttack(Attack attack) {
        attacks.add(attack);
    }
    public void takeDamage(int damage) {
        hp -= damage;
    }

    public int getHp() {
        return hp;
    }
    // A placeholder method for evolution
    public abstract Digimon digivolve();

    public String getName() {
        return name;
    }

    public ArrayList<Attack> getAttacks() {
        return attacks;
    }
}
