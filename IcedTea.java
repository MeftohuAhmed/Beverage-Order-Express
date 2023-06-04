import javax.swing.*;

public class IcedTea extends Beverage {
    private String flavor;
    private String[] flavors = {"Black Tea", "Green Tea", "Peach Tea", "Lemon Tea"};

    public IcedTea(String size, int amount, BeverageShop lbl) {
        super(size, amount);
        try {
            flavor = (String) JOptionPane.showInputDialog(lbl, "Select a flavor:", "Iced Tea Flavor",
                    JOptionPane.QUESTION_MESSAGE, null, flavors, flavors[0]);
            double price;
            if (size.equals("Small"))
                price = 3.5;
            else if (size.equals("Medium"))
                price = 5.0;
            else
                price = 6.5;

            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
    public String toString() {
        return super.toString() + flavor + " Iced Tea";
    }
}
