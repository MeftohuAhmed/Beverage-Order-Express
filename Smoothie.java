import javax.swing.*;

public class Smoothie extends Beverage {
    private String flavor;
    private String[] flavors = {"Strawberry", "Mango", "Blueberry", "Pineapple", "Banana"};

    public Smoothie(String size, int amount, BeverageShop lbl) {
        super(size, amount);
        try {
            flavor = (String) JOptionPane.showInputDialog(lbl, "Select a flavor:", "Smoothie Flavor",
                    JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);
            double price;
            if (size.equals("Small"))
                price = 4.5;
            else if (size.equals("Medium"))
                price = 6.5;
            else
                price = 8.5;

            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
    public String toString() {
        return super.toString() + flavor + " Smoothie";
    }
}
