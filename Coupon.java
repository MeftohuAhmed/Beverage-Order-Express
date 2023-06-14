/**
 * The Coupon class represents a coupon object with a code and a discount percentage.
 * It provides methods to check the validity of a coupon code and retrieve the discount percentage.
 */
public class Coupon {
    private String code;
    private double discountPercentage;

    /**
     * Constructs a new Coupon object with the specified code and discount percentage.
     *
     * @param code               The code of the coupon.
     * @param discountPercentage The discount percentage provided by the coupon.
     */
    public Coupon(String code, double discountPercentage) {
        this.code = code;
        this.discountPercentage = discountPercentage;
    }

    /**
     * Checks the validity of the entered coupon code.
     *
     * @param enteredCode The coupon code entered by the user.
     * @return true if the entered code matches the coupon's code, false otherwise.
     */
    public boolean isValid(String enteredCode) {
        return code.equals(enteredCode);
    }

    /**
     * Returns the discount percentage provided by the coupon.
     *
     * @return The discount percentage.
     */
    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
