import javax.swing.*;

public class Lemonade extends Beverage {
    private boolean sugar;
    private boolean carbonated;

    public Lemonade(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to select sugar preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like sugar?", "Sugar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            sugar = true;
        else
            sugar = false;

        // Prompt the user to select carbonation preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like it carbonated?", "Carbonation",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            carbonated = true;
        else
            carbonated = false;

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

    @Override
    public String toString() {
        String sugarOption = sugar ? "with sugar" : "without sugar";
        String carbonationOption = carbonated ? "carbonated" : "non-carbonated";

        return super.toString() + "Lemonade (" + sugarOption + ", " + carbonationOption + ")";
    }
}
