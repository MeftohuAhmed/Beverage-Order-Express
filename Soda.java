import javax.swing.*;

/**
 * The Soda class represents a specific type of beverage, soda, and extends the Beverage class.
 * It adds an additional attribute, flavor, to represent the flavor of the soda.
 * The class provides a constructor to prompt the user for the soda flavor, calculates the price based on size,
 * and overrides the toString() method to provide a string representation of the soda.
 */
public class Soda extends Beverage {
    private String flavor;
    private String[] flavors = {"Cola", "Lemon-Lime", "Orange", "Root Beer", "Ginger Ale"};

    /**
     * Constructs a new Soda object with the specified size, amount, and label component.
     * Prompts the user to select the flavor of the soda using a dialog box.
     * Calculates the price based on the size.
     *
     * @param size The size of the soda (e.g., small, medium, large).
     * @param amount The number of glasses of soda.
     * @param lbl The label component used for prompting the user.
     */
    public Soda(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        try {
            // Prompt the user to select the flavor of the soda using a dialog box
            flavor = (String) JOptionPane.showInputDialog(lbl, "Select a flavor:", "Soda Flavor",
                    JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);

            // Calculate the price based on size
            double price;
            if (size.equals("Small"))
                price = 2.0;
            else if (size.equals("Medium"))
                price = 3.0;
            else
                price = 4.0;

            setPrice(price);
        } catch (NullPointerException e) {
            // Handle case when the user cancels the flavor selection dialog
            // The flavor will be null in this case
        }
    }

    /**
     * Returns a string representation of the soda.
     * Appends the flavor to the superclass string representation.
     *
     * @return The string representation of the soda.
     */
    @Override
    public String toString() {
        return super.toString() + flavor + " Soda";
    }
}
