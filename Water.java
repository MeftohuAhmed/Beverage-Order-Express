import javax.swing.*;

/**
 * The Water class represents a specific type of beverage, water, and extends the Beverage class.
 * It adds an additional attribute, iced, to represent the ice preference of the water.
 * The class provides a constructor to prompt the user for the ice preference, calculates the price based on size,
 * and overrides the toString() method to provide a string representation of the water.
 */
public class Water extends Beverage {
    private boolean iced;

    /**
     * Constructs a new Water object with the specified size, amount, and label component.
     * Prompts the user to select the ice preference of the water using a dialog box.
     * Calculates the price based on the size and ice preference.
     *
     * @param size The size of the water (e.g., small, medium, large).
     * @param amount The number of glasses of water.
     * @param lbl The label component used for prompting the user.
     */
    public Water(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to select the ice preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like ice?", "Ice", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            iced = true;
        else
            iced = false;

        // Calculate the price based on size and ice preference
        double price;
        if (size.equals("Small"))
            price = 1.0;
        else if (size.equals("Medium"))
            price = 2.0;
        else
            price = 3.0;

        if (iced)
            price *= 1.25;

        setPrice(price);
    }

    /**
     * Returns a string representation of the water.
     * Appends the ice preference to the superclass string representation.
     *
     * @return The string representation of the water.
     */
    @Override
    public String toString() {
        if (iced)
            return super.toString() + "Water with ice";
        else
            return super.toString() + "Water";
    }
}
