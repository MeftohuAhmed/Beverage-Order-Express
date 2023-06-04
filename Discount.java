public class Discount {
    private double percentage;

    public Discount(double percentage) {
        this.percentage = percentage;
    }

    public double applyDiscount(double amount) {
        return amount * (1 - (percentage / 100));
    }
}
