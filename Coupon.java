public class Coupon {
    private String code;
    private double discountPercentage;

    public Coupon(String code, double discountPercentage) {
        this.code = code;
        this.discountPercentage = discountPercentage;
    }

    public boolean isValid(String enteredCode) {
        return code.equals(enteredCode);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
