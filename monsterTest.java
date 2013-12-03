package monster;

public class monsterTest {

    public static void main(String[] args) {
        Monster Kirk = new Monster();

        System.out.println("name: " + Kirk.randName());
        System.out.println(Kirk.getAttack() + " is the attack");
        System.out.println(Kirk.getHealth() + " is the health add the armor " + Kirk.getArmor());
        Kirk.printBattleCry();
        System.out.println(Kirk.getxPos() + " is the xpos");
        System.out.println(Kirk.getyPos() + " this is the ypos");
        System.out.println(Kirk.getdead());
        System.out.println("waht is your attack");
        Scanner scanner = new Scanner (System.in);
    }
}
