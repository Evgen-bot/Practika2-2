public class Main {
    public static void main(String[] args) {

        int startscore = 150;

        int replen = 2000;

        int bonus;
        if (replen <= 1000) {
            bonus = 0;
        } else {
            bonus = replen / 100;
        }
        int balance = startscore + bonus;

        System.out.println("Счет:" + balance);
    }
}