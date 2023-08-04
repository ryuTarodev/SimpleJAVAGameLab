package ProjectGame;

import java.util.Arrays;

public class Enemies {
    Character[] enemies;

    public Enemies(Character[] enemies) {
        this.enemies = enemies;

    }

    // public void getallEnemies() {
    // for (int i = 0; i < 3; i++) {
    // System.out.println(this.enemies[i]);
    // }
    // }

    public Character getRandomEnemies() {
        int RandomEnemies = (int) (Math.random() * 2);
        return enemies[RandomEnemies];
    }

    public Character[] getEnmies() {
        return enemies;
    }

    public void setEnmies(Character[] enmies) {
        this.enemies = enmies;
    }

    @Override
    public String toString() {
        return "Enemies [enemies=" + Arrays.toString(enemies) + "]";
    }

}
