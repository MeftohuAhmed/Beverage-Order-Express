import javax.swing.*;

public class Milkshake extends Beverage {
    private String name;

    public Milkshake(String size, int amount, BeverageShop lbl) {
        super(size, amount);
        name = JOptionPane.showInputDialog(lbl, "Enter the name of the Milkshake:", "Milkshake Name",
                JOptionPane.QUESTION_MESSAGE);

        double price;
        if (size.equals("Small"))
            price = 4.0;
        else if (size.equals("Medium"))
            price = 6.0;
        else
            price = 8.0;

        setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString() + name + " Milkshake";
    }
}
