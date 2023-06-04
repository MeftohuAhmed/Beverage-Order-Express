import javax.swing.*;

public class Juice extends Beverage {
    private String fruit;
    private String[] fruits = {"Apple", "Orange", "Pineapple"};

    public Juice(String size, int amount, BeverageShop lbl) {
        super(size, amount);
        try {
            fruit = (String) JOptionPane.showInputDialog(lbl, "Select a fruit:", "Fruit Selection",
                    JOptionPane.QUESTION_MESSAGE, null, fruits, fruits[0]);
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
        }
    }

    @Override
    public String toString() {
        return super.toString() + fruit + " Juice";
    }
}
