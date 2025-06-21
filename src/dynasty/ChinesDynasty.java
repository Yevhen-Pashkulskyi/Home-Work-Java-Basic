package dynasty;

public class ChinesDynasty {
    public static void main(String[] args) {
        byte warriorAttackLi = 13;
        byte archerAttackLi = 24;
        byte riderAttackLI = 46;
        int quantityLi = 860;
        System.out.println("Total attack Li: " +
                totalAttack(warriorAttackLi, archerAttackLi, riderAttackLI, quantityLi));
        byte warriorAttackMin = 9;
        byte archerAttackMin = 35;
        byte riderAttackMin = 12;
        int quantityMin = (int) (860 * 1.5);
        System.out.println("Total attack Min: " +
                totalAttack(warriorAttackMin, archerAttackMin, riderAttackMin, quantityMin));
    }

    private static int totalAttack(byte warrior, byte archer, byte rider, int quantity) {
        return (warrior + archer + rider) * quantity;
    }
}
