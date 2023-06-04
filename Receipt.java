import javax.swing.*;
import java.util.ArrayList;

public class Receipt {
    private ArrayList<Beverage> beverages;
    private double totalCost;
    private Discount discount;
    private Coupon coupon;

    public Receipt(ArrayList<Beverage> beverages, double totalCost) {
        this.beverages = beverages;
        this.totalCost = totalCost;

        discount = new Discount(10);
        coupon = new Coupon("COUPON20", 20);
    }

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
