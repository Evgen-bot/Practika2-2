public class Main {
    public static void main(String[] args) {

        int startScore = 150;

        int replen = 2000;

        int bonus;
        if (replen <= 1000) {
            bonus = 0;
        } else {
            bonus = replen / 100;
        }
        int balance = startScore + bonus;

        System.out.println("Счет:" + balance);
    }
}