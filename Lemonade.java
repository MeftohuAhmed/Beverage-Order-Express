import javax.swing.*;

/**
 * The Lemonade class represents a specific type of beverage, lemonade, and extends the Beverage class.
 * It adds additional attributes, sugar and carbonated, to represent the sugar preference and carbonation level of the lemonade.
 * The class provides a constructor to prompt the user for the sugar and carbonation preferences,
 * calculates the price based on size, sugar preference, and carbonation level,
 * and overrides the toString() method to provide a string representation of the lemonade.
 */
public class Lemonade extends Beverage {
    private boolean sugar;
    private boolean carbonated;

    /**
     * Constructs a new Lemonade object with the specified size, amount, and label component.
     * Prompts the user to select the sugar preference and carbonation level using dialog boxes.
     * Calculates the price based on the size, sugar preference, and carbonation level.
     *
     * @param size The size of the lemonade (e.g., small, medium, large).
     * @param amount The number of glasses of lemonade.
     * @param lbl The label component used for prompting the user.
     */
    public Lemonade(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to select the sugar preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like sugar?", "Sugar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            sugar = true;
        else
            sugar = false;

        // Prompt the user to select the carbonation preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like it carbonated?", "Carbonation",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            carbonated = true;
        else
            carbonated = false;

        // Calculate the price based on size, sugar preference, and carbonation level
        double price;
        if (size.equals("Small"))
            price = 3.0;
        else if (size.equals("Medium"))
            price = 4.5;
        else
            price = 6.0;

        if (sugar)
            price *= 1.25;
        if (carbonated)
            price *= 1.5;

        setPrice(price);
    }

    /**
     * Returns a string representation of the lemonade.
     * Includes information about sugar preference and carbonation level.
     *
     * @return The string representation of the lemonade.
     */
    @Override
    public String toString() {
        String sugarOption = sugar ? "with sugar" : "without sugar";
        String carbonationOption = carbonated ? "carbonated" : "non-carbonated";

        return super.toString() + " Lemonade (" + sugarOption + ", " + carbonationOption + ")";
    }
}
