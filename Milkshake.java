import javax.swing.*;

/**
 * The Milkshake class represents a specific type of beverage, milkshake, and extends the Beverage class.
 * It adds an additional attribute, name, to represent the name of the milkshake.
 * The class provides a constructor to prompt the user for the milkshake name, calculates the price based on size,
 * and overrides the toString() method to provide a string representation of the milkshake.
 */
public class Milkshake extends Beverage {
    private String name;

    /**
     * Constructs a new Milkshake object with the specified size, amount, and label component.
     * Prompts the user to enter the name of the milkshake using a dialog box.
     * Calculates the price based on the size.
     *
     * @param size The size of the milkshake (e.g., small, medium, large).
     * @param amount The number of glasses of milkshake.
     * @param lbl The label component used for prompting the user.
     */
    public Milkshake(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to enter the name of the milkshake using a dialog box
        name = JOptionPane.showInputDialog(lbl, "Enter the name of the Milkshake:", "Milkshake Name",
                JOptionPane.QUESTION_MESSAGE);

        // Calculate the price based on size
        double price;
        if (size.equals("Small"))
            price = 4.0;
        else if (size.equals("Medium"))
            price = 6.0;
        else
            price = 8.0;

        setPrice(price);
    }

    /**
     * Returns a string representation of the milkshake.
     * Appends the name to the superclass string representation.
     *
     * @return The string representation of the milkshake.
     */
    @Override
    public String toString() {
        return super.toString() + name + " Milkshake";
    }
}
