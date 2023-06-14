import javax.swing.*;

/**
 * The IcedTea class represents a specific type of beverage, iced tea, and extends the Beverage class.
 * It adds an additional attribute, flavor, to represent the flavor of the iced tea.
 * The class provides a constructor to prompt the user for the flavor, calculates the price based on size,
 * and overrides the toString() method to provide a string representation of the iced tea.
 */
public class IcedTea extends Beverage {
    private String flavor;
    private String[] flavors = {"Black Tea", "Green Tea", "Peach Tea", "Lemon Tea"};

    /**
     * Constructs a new IcedTea object with the specified size, amount, and label component.
     * Prompts the user to select the flavor using a dialog box.
     * Calculates the price based on the size.
     *
     * @param size The size of the iced tea (e.g., small, medium, large).
     * @param amount The number of glasses of iced tea.
     * @param lbl The label component used for prompting the user.
     */
    public IcedTea(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        try {
            // Prompt the user to select the flavor using a dialog box
            flavor = (String) JOptionPane.showInputDialog(lbl, "Select a flavor:", "Iced Tea Flavor",
                    JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);

            // Calculate the price based on size
            double price;
            if (size.equals("Small"))
                price = 3.5;
            else if (size.equals("Medium"))
                price = 5.0;
            else
                price = 6.5;

            setPrice(price);
        } catch (NullPointerException e) {
            // Handle case when the user cancels the flavor selection dialog
            // The flavor will be null in this case
        }
    }

    /**
     * Returns a string representation of the iced tea.
     * Appends the flavor to the superclass string representation.
     *
     * @return The string representation of the iced tea.
     */
    @Override
    public String toString() {
        return super.toString() + flavor + " Iced Tea";
    }
}
