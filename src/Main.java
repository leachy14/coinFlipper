import java.util.Objects;

public class Main {

    final double dollar = 1.00;
    double balance;
    Coin Nickel = new Coin("nickel", 0.05);
    Coin Dime = new Coin("dime", 0.10);
    Coin Quarter = new Coin("quarter", 0.25);

    public void TossCoins() {
        while (balance < dollar) {
            Nickel.toss();
            Dime.toss();
            Quarter.toss();
            if (Objects.equals(Nickel.getSideUp(), "heads")) {
                balance += Nickel.getValue();
                System.out.println("Nickel added to balance");
                System.out.println("Balance: " + balance);
            }
            if (Objects.equals(Dime.getSideUp(), "heads")) {
                balance += Dime.getValue();
                System.out.println("Dime added to balance");
                System.out.println("Balance: " + balance);
            }
            if (Objects.equals(Quarter.getSideUp(), "heads")) {
                balance += Quarter.getValue();
                System.out.println("Quarter added to balance");
                System.out.println("Balance: " + balance);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.TossCoins();
        System.out.println("Final Balance: " + main.balance);
    }

}
