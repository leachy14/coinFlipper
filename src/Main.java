import java.util.Objects;
/**
    * This is the main test program for the coin the program will create three different coins and flip them each
    * Everytime a coin lands on heads, it's added to a balance when that balance reaches a dollar, the program ends
    * @author Christopher Leach
 */
public class Main {

    final double dollar = 1.00;
    double balance;
    Coin Nickel = new Coin("nickel", 0.05);
    Coin Dime = new Coin("dime", 0.10);
    Coin Quarter = new Coin("quarter", 0.25);
    /**
     * This method will toss the coins until the balance reaches a dollar
     * It will also print out when each coin is added to the balance
     */
    public void TossCoins() {
        while (balance < dollar) {
            Nickel.toss();
            Dime.toss();
            Quarter.toss();
            if (Objects.equals(Nickel.getSideUp(), "heads")) {
                balance += Nickel.getValue();
                System.out.println("Nickel added to balance");
                //System.out.println("Balance: " + balance);
            }
            if (Objects.equals(Dime.getSideUp(), "heads")) {
                balance += Dime.getValue();
                System.out.println("Dime added to balance");
                //System.out.println("Balance: " + balance);
            }
            if (Objects.equals(Quarter.getSideUp(), "heads")) {
                balance += Quarter.getValue();
                System.out.println("Quarter added to balance");
                //System.out.println("Balance: " + balance);
            }
        }
    } //end TossCoins
    /**
     * This method will print out the results of the program
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.TossCoins();
        System.out.println("Final Balance: " + main.balance);
        /*
        Results:

         */
    }

}
