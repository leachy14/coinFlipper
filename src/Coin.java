/**
   * Coin class that extends the GenericCoin class
   * this can be used to represent a coin with a name and a value
   * @author Christopher Leach
 */
public class Coin extends GenericCoin {
    private String type;
    private double value;

    /**
     * Default constructor for the coin class
     * by default the coin has no value or name
     */
    public Coin() {
        type = "generic";
        value = 0;
    }
    /**
     * Alternative constructor that will allow the user to set the name and value of the coin
     * @param type
     * @param value
     */
    public Coin(String type, double value) {
        setType(type);
        setValue(value);
    }

    /**
     * These are getters and setters for the type and value of the coin 
     * @param type
     */
    private void setType(String type) {
        this.type = type;
    }
    private void setValue(double value) {
        this.value = value;
    }

    //getters
    public String getType() {
        return type;
    }
    public double getValue() {
        return value;
    }
}
