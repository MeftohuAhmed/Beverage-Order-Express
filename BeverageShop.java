import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BeverageShop extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JLabel lblSize, lblBev, lblGlass, lblReport;
    private JComboBox<String> size;
    private JRadioButton rdJuice, rdWater, rdTea, rdCoffee, rdSoda, rdMilkshake, rdSmoothie, rdLemonade, rdIcedTea;
    private ButtonGroup btnGroup;
    private JTextField txtGlass;
    private JButton btnAdd, btnOrder;
    private int amountOf;
    private ArrayList<Beverage> listOfBvr = new ArrayList<Beverage>();

    public BeverageShop() {
        setLayout(null);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Beverage Shop");
        initializeComponents();
        btnAdd.addActionListener(this);
        btnOrder.addActionListener(this);
        setVisible(true);
    }

    public void initializeComponents() {
        Font headingFont = new Font("Arial", Font.BOLD, 18);
        Font labelFont = new Font("Arial", Font.PLAIN, 14);

        lblSize = new JLabel("Select Size:");
        lblSize.setFont(labelFont);
        lblSize.setSize(250, 30);
        lblSize.setLocation(100, 20);
        add(lblSize);

        String[] sizes = {"Small", "Medium", "Large"};
        size = new JComboBox<String>(sizes);
        size.setFont(labelFont);
        size.setSelectedIndex(0);
        size.setSize(100, 25);
        size.setLocation(100, 60);
        add(size);

        lblBev = new JLabel("Select Beverage Type:");
        lblBev.setFont(labelFont);
        lblBev.setSize(500, 30);
        lblBev.setLocation(100, 100);
        add(lblBev);

        btnGroup = new ButtonGroup();

        rdJuice = new JRadioButton("Juice");
        rdJuice.setFont(labelFont);
        rdJuice.setSize(75, 30);
        rdJuice.setLocation(100, 140);
        add(rdJuice);

        rdWater = new JRadioButton("Water");
        rdWater.setFont(labelFont);
        rdWater.setSize(75, 30);
        rdWater.setLocation(175, 140);
        add(rdWater);

        rdTea = new JRadioButton("Tea");
        rdTea.setFont(labelFont);
        rdTea.setSize(75, 30);
        rdTea.setLocation(250, 140);
        add(rdTea);

        rdCoffee = new JRadioButton("Coffee");
        rdCoffee.setFont(labelFont);
        rdCoffee.setSize(75, 30);
        rdCoffee.setLocation(325, 140);
        add(rdCoffee);

        rdSoda = new JRadioButton("Soda");
        rdSoda.setFont(labelFont);
        rdSoda.setSize(75, 30);
        rdSoda.setLocation(400, 140);
        add(rdSoda);

        rdMilkshake = new JRadioButton("Milkshake");
        rdMilkshake.setFont(labelFont);
        rdMilkshake.setSize(100, 30);
        rdMilkshake.setLocation(100, 180);
        add(rdMilkshake);

        rdSmoothie = new JRadioButton("Smoothie");
        rdSmoothie.setFont(labelFont);
        rdSmoothie.setSize(100, 30);
        rdSmoothie.setLocation(200, 180);
        add(rdSmoothie);

        rdLemonade = new JRadioButton("Lemonade");
        rdLemonade.setFont(labelFont);
        rdLemonade.setSize(100, 30);
        rdLemonade.setLocation(300, 180);
        add(rdLemonade);

        rdIcedTea = new JRadioButton("Iced Tea");
        rdIcedTea.setFont(labelFont);
        rdIcedTea.setSize(100, 30);
        rdIcedTea.setLocation(400, 180);
        add(rdIcedTea);

        btnGroup.add(rdJuice);
        btnGroup.add(rdWater);
        btnGroup.add(rdTea);
        btnGroup.add(rdCoffee);
        btnGroup.add(rdSoda);
        btnGroup.add(rdMilkshake);
        btnGroup.add(rdSmoothie);
        btnGroup.add(rdLemonade);
        btnGroup.add(rdIcedTea);

        lblGlass = new JLabel("Enter the Number of Glasses:");
        lblGlass.setFont(labelFont);
        lblGlass.setSize(500, 30);
        lblGlass.setLocation(100, 220);
        add(lblGlass);

        txtGlass = new JTextField();
        txtGlass.setFont(labelFont);
        txtGlass.setSize(300, 25);
        txtGlass.setLocation(100, 260);
        add(txtGlass);

        btnAdd = new JButton("Add to Order");
        btnAdd.setFont(labelFont);
        btnAdd.setSize(150, 40);
        btnAdd.setLocation(100, 310);
        add(btnAdd);

        btnOrder = new JButton("Place Order");
        btnOrder.setFont(labelFont);
        btnOrder.setSize(150, 40);
        btnOrder.setLocation(270, 310);
        btnOrder.setEnabled(false);
        add(btnOrder);

        lblReport = new JLabel();
        lblReport.setFont(headingFont);
        lblReport.setSize(500, 50);
        lblReport.setLocation(100, 360);
        add(lblReport);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sizeOf = (String) size.getSelectedItem();

        if (e.getSource().equals(btnAdd)) {
            if ((rdJuice.isSelected() || rdWater.isSelected() || rdTea.isSelected() || rdCoffee.isSelected() ||
                    rdSoda.isSelected() || rdMilkshake.isSelected() || rdSmoothie.isSelected() || rdLemonade.isSelected()
                    || rdIcedTea.isSelected()) && !(txtGlass.getText().isEmpty())) {
                try {
                    amountOf = Integer.parseInt(txtGlass.getText().trim());
                    Beverage bvr;
                    if (rdJuice.isSelected()) {
                        bvr = new Juice(sizeOf, amountOf, this);
                    } else if (rdWater.isSelected()) {
                        bvr = new Water(sizeOf, amountOf, this);
                    } else if (rdTea.isSelected()) {
                        bvr = new Tea(sizeOf, amountOf, this);
                    } else if (rdCoffee.isSelected()) {
                        bvr = new Coffee(sizeOf, amountOf, this);
                    } else if (rdSoda.isSelected()) {
                        bvr = new Soda(sizeOf, amountOf, this);
                    } else if (rdMilkshake.isSelected()) {
                        bvr = new Milkshake(sizeOf, amountOf, this);
                    } else if (rdSmoothie.isSelected()) {
                        bvr = new Smoothie(sizeOf, amountOf, this);
                    } else if (rdLemonade.isSelected()) {
                        bvr = new Lemonade(sizeOf, amountOf, this);
                    } else {
                        bvr = new IcedTea(sizeOf, amountOf, this);
                    }
                    txtGlass.setText(null);
                    listOfBvr.add(bvr);
                    lblReport.setText(bvr.toString() + " added to your order");
                    btnGroup.clearSelection();
                    btnOrder.setEnabled(true);
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid number of glasses");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a beverage type and enter the number of glasses");
            }
        }
        if (e.getSource().equals(btnOrder)) {
            String report = "";
            double totalCost = 0.0;
            for (Beverage beverage : listOfBvr) {
                report += beverage.toString();
                double totalCostOfBvr = beverage.getAmount() * beverage.getPrice();
                totalCost += totalCostOfBvr;
                report = report + " - " + totalCostOfBvr + " USD\n";
            }

            // Create a receipt object and display the receipt using a dialog box
            Receipt receipt = new Receipt(listOfBvr, totalCost);
            JOptionPane.showMessageDialog(this, receipt.getReceiptText());

            lblReport.setText(null);
            btnOrder.setEnabled(false);
            listOfBvr.clear();
        }
    }

    public static void main(String[] args) {
        new BeverageShop();
    }
}
