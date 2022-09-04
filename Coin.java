public class Coin extends GenericCoin {
    /*
    this class is supposed to represent a coin with a value and a name
    it inherets GenericCoin, and should have constructors and setters and getters
     */
    private String type;
    private int value;

    //constructors
    public coin() {
        type = "generic";
        value = 0;
    }

    public coin(String type, int value) {
        setType(type);
        setValue(value);
    }

    //setters
    private void setType(String type) {
        this.type = type;
    }
    private void setValue(int value) {
        this.value = value;
    }

    //getters
    public String getType() {
        return type;
    }
    public int getValue() {
        return value;
    }
    /*
    this class should be functional now, I could write a new program to test it or I could use this file
     */
}
