import javax.swing.*;

/**
 * The Juice class represents a specific type of beverage, juice, and extends the Beverage class.
 * It adds an additional attribute, fruit, to represent the fruit used in the juice.
 * The class provides a constructor to prompt the user for the fruit, calculates the price based on size and fruit,
 * and overrides the toString() method to provide a string representation of the juice.
 */
public class Juice extends Beverage {
    private String fruit;
    private String[] fruits = {"Apple", "Orange", "Pineapple"};

    /**
     * Constructs a new Juice object with the specified size, amount, and label component.
     * Prompts the user to select the fruit used in the juice using a dialog box.
     * Calculates the price based on the size and fruit.
     *
     * @param size The size of the juice (e.g., small, medium, large).
     * @param amount The number of glasses of juice.
     * @param lbl The label component used for prompting the user.
     */
    public Juice(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        try {
            // Prompt the user to select the fruit used in the juice using a dialog box
            fruit = (String) JOptionPane.showInputDialog(lbl, "Select a fruit:", "Fruit Selection",
                    JOptionPane.QUESTION_MESSAGE, null, fruits, fruits[0]);

            // Calculate the price based on size and fruit
            double price;
            if (size.equals("Small"))
                price = 5.0;
            else if (size.equals("Medium"))
                price = 7.0;
            else
                price = 9.0;

            if (fruit.equals("Orange"))
                price *= 1.25;
            if (fruit.equals("Pineapple"))
                price *= 1.5;

            setPrice(price);
        } catch (NullPointerException e) {
            // Handle case when the user cancels the fruit selection dialog
            // The fruit will be null in this case
        }
    }

    /**
     * Returns a string representation of the juice.
     * Appends the fruit to the superclass string representation.
     *
     * @return The string representation of the juice.
     */
    @Override
    public String toString() {
        return super.toString() + fruit + " Juice";
    }
}
