import javax.swing.*;

/**
 * The Coffee class represents a specific type of beverage, coffee, and extends the Beverage class.
 * It adds an additional attribute, milk, to represent the milk preference of the coffee.
 * The class provides a constructor to prompt the user for the milk preference, calculates the price based on size and milk preference,
 * and overrides the toString() method to provide a string representation of the coffee.
 */
public class Coffee extends Beverage {
    private boolean milk;

    /**
     * Constructs a new Coffee object with the specified size, amount, and label component.
     * Prompts the user to select the milk preference using a dialog box.
     * Calculates the price based on the size and milk preference.
     *
     * @param size The size of the coffee (e.g., small, medium, large).
     * @param amount The number of glasses of coffee.
     * @param lbl The label component used for prompting the user.
     */
    public Coffee(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to select milk preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like milk?", "Milk", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            milk = true;
        else
            milk = false;

        // Calculate the price based on size and milk preference
        double price;
        if (size.equals("Small"))
            price = 3.5;
        else if (size.equals("Medium"))
            price = 5.0;
        else
            price = 6.5;

        if (milk)
            price *= 1.5;

        setPrice(price);
    }

    /**
     * Returns a string representation of the coffee.
     * If milk preference is true, it appends " Coffee with Milk" to the superclass string representation.
     * Otherwise, it appends " Coffee".
     *
     * @return The string representation of the coffee.
     */
    @Override
    public String toString() {
        if (milk)
            return super.toString() + " Coffee with Milk";
        else
            return super.toString() + " Coffee";
    }
}
