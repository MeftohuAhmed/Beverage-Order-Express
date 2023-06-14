import javax.swing.*;

/**
 * The Tea class represents a specific type of beverage, tea, and extends the Beverage class.
 * It adds an additional attribute, sugar, to represent the sugar preference of the tea.
 * The class provides a constructor to prompt the user for the sugar preference, calculates the price based on size,
 * and overrides the toString() method to provide a string representation of the tea.
 */
public class Tea extends Beverage {
    private boolean sugar;

    /**
     * Constructs a new Tea object with the specified size, amount, and label component.
     * Prompts the user to select the sugar preference of the tea using a dialog box.
     * Calculates the price based on the size and sugar preference.
     *
     * @param size The size of the tea (e.g., small, medium, large).
     * @param amount The number of glasses of tea.
     * @param lbl The label component used for prompting the user.
     */
    public Tea(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to select the sugar preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like sugar?", "Sugar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            sugar = true;
        else
            sugar = false;

        // Calculate the price based on size and sugar preference
        double price;
        if (size.equals("Small"))
            price = 3.0;
        else if (size.equals("Medium"))
            price = 4.0;
        else
            price = 5.0;

        if (sugar)
            price *= 1.25;

        setPrice(price);
    }

    /**
     * Returns a string representation of the tea.
     * Appends the sugar preference to the superclass string representation.
     *
     * @return The string representation of the tea.
     */
    @Override
    public String toString() {
        if (sugar)
            return super.toString() + "Tea with sugar";
        else
            return super.toString() + "Tea";
    }
}
