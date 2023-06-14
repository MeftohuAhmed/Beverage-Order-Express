/**
 * The Beverage class represents a beverage object with its size, amount, and price.
 * It provides methods to get and set the size, price, and amount of the beverage.
 * The class also overrides the toString() method to provide a string representation of the beverage.
 */
public class Beverage {
    private String size;
    private int amount;
    private double price;

    /**
     * Constructs a new Beverage object with the specified size and amount.
     * The price is initially set to 0.0.
     *
     * @param size   The size of the beverage (e.g., small, medium, large).
     * @param amount The number of glasses of the beverage.
     */
    public Beverage(String size, int amount) {
        this.size = size;
        this.amount = amount;
        price = 0.0;
    }

    /**
     * Returns the size of the beverage.
     *
     * @return The size of the beverage.
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the beverage.
     *
     * @param size The size of the beverage.
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Returns the price of the beverage.
     *
     * @return The price of the beverage.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the beverage.
     *
     * @param price The price of the beverage.
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Returns the amount of the beverage.
     *
     * @return The amount of the beverage.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount of the beverage.
     *
     * @param amount The amount of the beverage.
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Returns a string representation of the beverage.
     * The format is "{amount} {size} Glass(es) of".
     *
     * @return The string representation of the beverage.
     */
    @Override
    public String toString() {
        return String.format("%d %s Glass(es) of", this.getAmount(), this.getSize());
    }
}
