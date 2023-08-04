package ProjectGame;

public class Character {
    String name;
    int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // when was hit
    public void decreaseHealth(int damage) {
        health -= damage;
        System.out.println(name + " Hp ramaining  " + health);
    }

    // attack enemies
    public void attack(Character target) {
        int atkdamage = (int) (Math.random() * 20);
        System.out.println(name + " attack " + target.name + " for " + atkdamage + " damage!");
        target.decreaseHealth(atkdamage);
    }

    // potion
    public void heal() {
        int healing = (int) (Math.random() * 40);
        health += healing;
        System.out.println("Your character heal " + healing + " Hp");
    }

    public boolean isAlive() {
        return health > 0;
        // return (health <= 0) ? true : false;
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", health=" + health + "]";
    }

    // getter setter

}
