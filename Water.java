import javax.swing.*;

public class Water extends Beverage {
    private boolean iced;

    public Water(String size, int amount, BeverageShop lbl) {
        super(size, amount);

        // Prompt the user to select ice preference using a dialog box
        if (JOptionPane.showConfirmDialog(lbl, "Would you like ice?", "Ice", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            iced = true;
        else
            iced = false;

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

    @Override
    public String toString() {
        if (iced)
            return super.toString() + "Water with ice";
        else
            return super.toString() + "Water";
    }
}
