// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int start = 200;
        int cash = 9000;
        int percent = 1;

        int balance;
        if (cash > 1000) {
            balance = cash * percent / 100 + cash + start;
        } else {
            balance = start + cash;
        }

        System.out.println("Итоговый бонус: " + balance);
    }
}