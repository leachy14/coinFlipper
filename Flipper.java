public class Flipper {
    //This class is the flipper class, it should toss two coins 50 times each
    //It needs to count how many times each coin comes up heads, and compare both coins to see which had heads more often.

    //initialize the coins
    GenericCoin coin1 = new GenericCoin();
    GenericCoin coin2 = new GenericCoin();
    private int coin2Heads, coin1Heads;

    public void flipper() {
        //this method should flip the coins 50 times each
        for (int i = 0; i < 50; i++) {
            coin1.toss();
            coin2.toss();
            if (coin1.getSideUp() == "heads") {
                //coin1Heads++; //this may be bad practice
                setCoin1Heads(getCoin1Heads() + 1);
            }
            if (coin2.getSideUp() == "heads") {
                //coin2Heads++; // ^^
                setCoin2Heads(getCoin2Heads() + 1);
            }
        }
    }
    //setters
    private void setCoin1Heads(int heads) {
        coin1Heads = heads;
    }
    private void setCoin2Heads(int heads) {
        coin2Heads = heads;
    }
    //getters
    public int getCoin1Heads() {
        return coin1Heads;
    }
    public int getCoin2Heads() {
        return coin2Heads;
    }
    public void compare() {
        //this method should compare the two coins and print out which one had heads more often
        if (coin1Heads > coin2Heads) {
            System.out.println("Coin 1 had heads more often");
        } else if (coin1Heads < coin2Heads) {
            System.out.println("Coin 2 had heads more often");
        } else {
            System.out.println("Both coins had heads the same amount of times");
        }
    }

    public static void main(String args[]) {
        Flipper flip = new Flipper();
        flip.flipper();
        System.out.println("Coin 1 had " + flip.getCoin1Heads() + " heads");
        System.out.println("Coin 2 had " + flip.getCoin2Heads() + " heads");
        flip.compare();
    }

}
