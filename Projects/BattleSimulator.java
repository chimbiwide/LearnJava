package Projects;
import java.util.Scanner;
import java.util.Random;

public class BattleSimulator {

    // Method to calculate damage with some randomness
    public static int calculateDamage(int baseAttack, int variation) {
        // Add your code here
        int finalDamage = baseAttack + variation;
        return finalDamage;
        // Hint: return baseAttack + random variation
    }

    public static int caculateHealth(int health, int damage){
        int finalHealth = health - damage;
        return finalHealth;
    }

    // Method to display character stats
    public static void displayStats(String name, int health, int attack) {
        // Add your code here
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Damage: " + attack);
        System.out.println("--------------------");
    }

    public static int genRandomNumber(int min, int max) {
        Random random = new Random();
        int num = random.nextInt(min, max+1);
        return num;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean quit = false;
        boolean gameOver = false;
        String winner = " ";
        final int Phealth = 100;
        final int OppHealth = 80;
        // Enemy names array
        String[] enemies = {"Goblin", "Orc Warrior", "Dragon", "Skeleton Mage"};

        //Player stats
        int Playerdamage = 10;
        int Playerhealth = 100;

        //Enemy stats
        int CPUdamage = 8;
        int CPUhealth = 80;

        int round = 0;
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("********************");
        displayStats(name, Playerhealth, Playerdamage);
        Thread.sleep(1000);
        while(!quit){
            Playerhealth = Phealth;
            CPUhealth = OppHealth;
            gameOver = false;
            int enemyType = genRandomNumber(0, 3);
            String opp = enemies[enemyType];
            System.out.println("Your opponent is " + opp);
            displayStats(opp, CPUhealth, CPUdamage);
            Thread.sleep(1000);
            //Start
            System.out.println("---BATTLE BEGINS---");
            while(!gameOver) {
                round++;
                System.out.println("Round " + round + ":");
                 CPUhealth = caculateHealth(CPUhealth, Playerdamage);
                System.out.println(name + " attacks for " + Playerdamage + " damage! " + opp + " has " + CPUhealth + " health left!");
                Thread.sleep(1000);
                if (CPUhealth <= 0){
                    winner = name;
                    gameOver = true;
                }
                else {
                    Playerhealth = caculateHealth(Playerhealth, CPUdamage);
                    System.out.println(opp + " attacks for " + CPUdamage + " damage! " + name + " has " + Playerhealth + " health left!");
                    Thread.sleep(1000);
                    if (Playerhealth <= 0) {
                        winner = opp;
                        gameOver = true;
                    }
                }
            }
            System.out.println("********************");
            System.out.println(winner + " is the winner!");
            System.out.println("------------------");
            Thread.sleep(1000);
            System.out.print("Do you want to quit? (y/n): ");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("Y")){
                quit = true;
            }
        }
        System.out.println("Thank you for playing!");
        input.close();
    }
}