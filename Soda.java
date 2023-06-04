import javax.swing.*;

public class Soda extends Beverage {
    private String flavor;
    private String[] flavors = {"Cola", "Lemon-Lime", "Orange", "Root Beer", "Ginger Ale"};

    public Soda(String size, int amount, BeverageShop lbl) {
        super(size, amount);
        try {
            flavor = (String) JOptionPane.showInputDialog(lbl, "Select a flavor:", "Soda Flavor",
                    JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);
            double price;
            if (size.equals("Small"))
                price = 2.0;
            else if (size.equals("Medium"))
                price = 3.0;
            else
                price = 4.0;

            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
    public String toString() {
        return super.toString() + flavor + " Soda";
    }
}
