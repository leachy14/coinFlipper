import java.util.Objects;
/**
    * Program creates two coins and flips them 50 times each, the program counts the amount of times each coin lands on heads
    * the program then compares the results and prints the one with heads more often
    * @author Christopher Leach
 */

public class Flipper {
    GenericCoin coin1 = new GenericCoin();
    GenericCoin coin2 = new GenericCoin();
    private int coin2Heads, coin1Heads;
    
    public void flipper() {
        //this method should flip the coins 50 times each
        for (int i = 0; i < 50; i++) {
            coin1.toss();
            coin2.toss();
            if (Objects.equals(coin1.getSideUp(), "heads")) {
                coin1Heads++;
            }
            if (Objects.equals(coin2.getSideUp(), "heads")) {
                coin2Heads++;
            }
        }
    } //end flipper

    /**
     * These are the getters for the amount of heads each coin has
     * @return in coin1heads and coin2heads
     */
    public int getCoin1Heads() {
        return coin1Heads;
    }
    public int getCoin2Heads() {
        return coin2Heads;
    }

    //method to compare the results of both coins
    public void compare() {
        if (coin1Heads > coin2Heads) {
            System.out.println("Coin 1 had heads more often");
        } else if (coin1Heads < coin2Heads) {
            System.out.println("Coin 2 had heads more often");
        } else {
            System.out.println("Both coins had heads the same amount of times");
        }
    } //end compare

    /**
     * this method will print out the results of the program
     * @param args main args
     */
    public static void main(String[] args) {
        Flipper flip = new Flipper();
        flip.flipper();
        System.out.println("Coin 1 had " + flip.getCoin1Heads() + " heads");
        System.out.println("Coin 2 had " + flip.getCoin2Heads() + " heads");
        flip.compare();
        /*
        Results:
        Run 1: Coin 1 had 24 heads
                Coin 2 had 24 heads
                Both coins had heads the same amount of times
        Run 2: Coin 1 had 27 heads
                Coin 2 had 29 heads
                Coin 2 had heads more often
        Run 3: Coin 1 had 29 heads
                Coin 2 had 20 heads
                Coin 1 had heads more often
         */
    } //end main

}
