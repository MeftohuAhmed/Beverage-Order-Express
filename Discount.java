/**
 * The Discount class represents a discount object with a percentage value.
 * It provides a method to apply the discount to a given amount.
 */
public class Discount {
    private double percentage;

    /**
     * Constructs a new Discount object with the specified percentage value.
     *
     * @param percentage The discount percentage value.
     */
    public Discount(double percentage) {
        this.percentage = percentage;
    }

    /**
     * Applies the discount to the given amount.
     *
     * @param amount The original amount to which the discount is applied.
     * @return The discounted amount after applying the discount.
     */
    public double applyDiscount(double amount) {
        return amount * (1 - (percentage / 100));
    }
}
