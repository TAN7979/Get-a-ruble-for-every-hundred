public class Main {
    public static void main(String[] args) {

        int accountBalance = 90;
        int depositAmount = 900;

        int scores;
        if (depositAmount >= 1000) {
            scores = 1;
        } else {
            scores = 0;
        }
        //int scores = depositAmount ? 1 : 0

        int bonus = depositAmount / 100 * scores;
        int newBalance = accountBalance + depositAmount + bonus;

        System.out.println("Бонус: " + bonus);
        System.out.println("Новый баланс: " + newBalance);
    }
}