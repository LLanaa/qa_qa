public class Main1 {
    public static void main(String[] args) {

        int amount = 100;
        int amountReplenishment = 1100;

        if (amountReplenishment > 1000) {
            int count2 = amountReplenishment / 100;
            System.out.println("Сумма на счете равна: " + (amount + amountReplenishment + count2) + "." + " Сумма начисленных бонусов: " + count2);
        } else {
            System.out.println("Сумма на счете равна: " + (amount + amountReplenishment) + "." + " Совершите покупку свыше 1000 рублей для начисления бонусов.");
        }
    }
}
