import javax.swing.*;
import java.util.ArrayList;

/**
 * The Receipt class represents a receipt for a beverage order.
 * It contains information about the beverages, total cost, and applies discounts and coupons if applicable.
 */
public class Receipt {
    private ArrayList<Beverage> beverages;
    private double totalCost;
    private Discount discount;
    private Coupon coupon;

    /**
     * Constructs a new Receipt object with the specified list of beverages and total cost.
     * Initializes the discount and coupon objects with default values.
     *
     * @param beverages  The list of beverages included in the order.
     * @param totalCost  The total cost of the order.
     */
    public Receipt(ArrayList<Beverage> beverages, double totalCost) {
        this.beverages = beverages;
        this.totalCost = totalCost;

        discount = new Discount(10);
        coupon = new Coupon("COUPON20", 20);
    }

    /**
     * Generates the text representation of the receipt.
     * Includes information about the ordered beverages, total cost, applied discount, and applied coupon.
     *
     * @return The text representation of the receipt.
     */
    public String getReceiptText() {
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("----- RECEIPT -----\n\n");

        for (Beverage beverage : beverages) {
            receiptText.append(beverage.toString()).append("\n");
        }

        receiptText.append("\n");

        double discountedCost = discount.applyDiscount(totalCost);
        receiptText.append("Total Cost: $").append(totalCost).append("\n");

        String enteredCode = JOptionPane.showInputDialog(null, "Enter coupon code (if you have one):");
        if (coupon.isValid(enteredCode)) {
            double couponDiscount = totalCost * (coupon.getDiscountPercentage() / 100);
            double finalCost = totalCost - couponDiscount;
            receiptText.append("Coupon Applied: $").append(couponDiscount).append("\n");
            receiptText.append("Discounted Cost: $").append(finalCost).append("\n");
            totalCost = finalCost;
        } else {
            receiptText.append("Coupon Code is invalid or not entered.\n");
        }

        receiptText.append("-------------------");

        return receiptText.toString();
    }
}
