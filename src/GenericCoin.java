import java.util.Objects;

public class GenericCoin implements coinInterface {
    //this class is supposed to represent a coin with no value or name
    //the coin should have a heads side and a tails side and shold be able to tell which side is up
    private String sideUp;
    private final String heads = "heads";
    private final String tails = "tails";

    // this is the toss method, meant to emulate a flip of the coin
    public void toss() {
        if (Math.random() > 0.5) {
            setSideUp(heads);
        } else {
            setSideUp(tails);
        }
    }
    //this is the getSideUp method, meant to return the side that is up
    public String getSideUp() {
        return sideUp;
    }

    // set side up
    private void setSideUp(String side) {
        if (Objects.equals(side, heads)) {
            sideUp = heads;
        } else {
            sideUp = tails;
        }
    }
}
