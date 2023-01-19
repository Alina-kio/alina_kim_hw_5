public class Main {
    public static void main(String[] args) {



        Hero Berserk = new Hero(100, "magican", 35);
        System.out.println("Berserk health: " + Berserk.getHealth() + " attackType: " + Berserk.getAttackType() + " damage: " + Berserk.getDamage());

        Hero Golem = new Hero( 100, 50);
        System.out.println("Golem health: " + Golem.getHealth() + " damage: " + Golem.getDamage());

        Boss Alina = new Boss(150, 700, "Critical Damage " );
        System.out.println("Boss Damage: " + Alina.getBossDamage() + " Health: " + Alina.getBossHealth() + " Attack Type: " + Alina.getBossAttackType());


        System.out.println();
        createHeroes();
    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(120, "physical", 40);
        Hero hero2 = new Hero(150, 50, "physical");

        Hero[] hero = {hero1, hero2};
        for (int i = 0; i < hero.length; i++) {
            System.out.println("Health: " + hero[i].getHealth() + " Damage: " + hero[i].getDamage() + " Attack Type: " + hero[i].getAttackType());
        }
        return hero;
    }

}