import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class Main {
    public static void main(String[] args) {



        Hero Berserk = new Hero(100, "magican", 35);
        System.out.println("Berserk health: " + Berserk.getHealth() + " attackType: " + Berserk.attackType + " damage: " + Berserk.getDamage());

        Hero Golem = new Hero( 100, 50);
        System.out.println("Golem health: " + Golem.getHealth() + " damage: " + Golem.getDamage());

        Boss Alina = new Boss(150, 700, "Critical Damage " );
        System.out.println("Boss Damage: " + Alina.getBossDamage() + " Health: " + Alina.getBossHealth() + " Attack Type:" + Alina.getBossAttackType());
    }

}