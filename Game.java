package ProjectGame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to EzGame");
        System.out.println("-----------------------");
        // Input CharcterName
        Scanner scPlayerName = new Scanner(System.in);
        System.out.print("Insert your Name: ");
        String playername = scPlayerName.next();
        Character player = new Character(playername, 100);
        // Character player = new Character("Taro", 100);
        System.out.println("-----------------------");

        // MobDifficulty
        Character[] mobLowLV = {
                new Character("Arthur", 80),
                new Character("Zombie", 50),
                new Character("Archer", 40)
        };
        Character[] mobBoss = {
                new Character("EnderDragon", 120),
                new Character("Wither", 200),
                new Character("Warden", 500)
        };

        System.out.println("Choose your MobDifficulty: ");
        System.out.println("1.lowlevelmob");
        System.out.println("2.BOSS!!!");
        System.out.print("Enter: ");
        Enemies usedEnemiesType = null;
        Scanner scMobDifficulty = new Scanner(System.in);
        int mobchoice = scMobDifficulty.nextInt();
        switch (mobchoice) {
            case 1:
                usedEnemiesType = new Enemies(mobLowLV);
                break;
            case 2:
                usedEnemiesType = new Enemies(mobBoss);
                break;
            default:
                break;
        }

        Character yourenemy = usedEnemiesType.getRandomEnemies();
        System.out.println("your enemy is: " + yourenemy);

        while (true) {
            System.out.println("Choose your choice");
            System.out.println("1.Attack");
            System.out.println("2.Heal");
            System.out.print("Enter: ");
            Scanner tasks = new Scanner(System.in);
            int choice = tasks.nextInt();
            System.out.println("-----------------------");
            switch (choice) {
                case 1:
                    player.attack(yourenemy);
                    break;
                case 2:
                    player.heal();
                    break;
                default:
                    break;
            }

            if (!player.isAlive()) {
                System.out.println("-----------------------");
                System.out.println("You Died GameOver!");
                break;
            } else if (!yourenemy.isAlive()) {
                System.out.println("-----------------------");
                System.out.println("You Win!");
                break;
            }
            yourenemy.attack(player);
            if (!player.isAlive()) {
                System.out.println("-----------------------");
                System.out.println("You Died GameOver!");
                break;
            } else if (!yourenemy.isAlive()) {
                System.out.println("-----------------------");
                System.out.println("You Win!");
                break;
            }
            System.out.println(player);
            System.out.println(yourenemy);
            System.out.println("-----------------------");
        }
    }
}
