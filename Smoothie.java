import javax.swing.*;

/**
 * The Smoothie class represents a specific type of beverage, smoothie, and extends the Beverage class.
 * It adds an additional attribute, flavor, to represent the flavor of the smoothie.
 * The class provides a constructor to prompt the user for the smoothie flavor, calculates the price based on size,
 * and overrides the toString() method to provide a string representation of the smoothie.
 */
public class Smoothie extends Beverage {
    private String flavor;
    private String[] flavors = {"Strawberry", "Mango", "Blueberry", "Pineapple", "Banana"};

    /**
     * Constructs a new Smoothie object with the specified size, amount, and label component.
     * Prompts the user to select the flavor of the smoothie using a dialog box.
     * Calculates the price based on the size.
     *
     * @param size The size of the smoothie (e.g., small, medium, large).
     * @param amount The number of glasses of smoothie.
     * @param lbl The label component used for prompting the user.
     */
    public Smoothie(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        try {
            // Prompt the user to select the flavor of the smoothie using a dialog box
            flavor = (String) JOptionPane.showInputDialog(lbl, "Select a flavor:", "Smoothie Flavor",
                    JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);

            // Calculate the price based on size
            double price;
            if (size.equals("Small"))
                price = 4.5;
            else if (size.equals("Medium"))
                price = 6.5;
            else
                price = 8.5;

            setPrice(price);
        } catch (NullPointerException e) {
            // Handle case when the user cancels the flavor selection dialog
            // The flavor will be null in this case
        }
    }

    /**
     * Returns a string representation of the smoothie.
     * Appends the flavor to the superclass string representation.
     *
     * @return The string representation of the smoothie.
     */
    @Override
    public String toString() {
        return super.toString() + flavor + " Smoothie";
    }
}
