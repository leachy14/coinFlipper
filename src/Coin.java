/*
   * Coin class that extends the GenericCoin class
   * this can be used to represent a coin with a name and a value
   * @author Christopher Leach
   * Data Structures assignment
 */
public class Coin extends GenericCoin {
    private String type;
    private double value;

    //constructors
    public Coin() {
        type = "generic";
        value = 0;
    }

    public Coin(String type, double value) {
        setType(type);
        setValue(value);
    }

    //setters
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
