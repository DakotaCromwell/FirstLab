
package com.mycompany.lab1;

import javax.swing.JOptionPane;

public class Problem7Main {
    public static void main(String[] args) {
        float stateSalesTax = .04F;
        float countySalesTax = .02F;
        String priceBeforeTax = JOptionPane.showInputDialog("Please enter the purchase price as a numerical value");
        try {
        float priceBeforeTaxFloat = Float.parseFloat(priceBeforeTax);
        float priceAfterTax = (countySalesTax + stateSalesTax) * priceBeforeTaxFloat + priceBeforeTaxFloat;
        System.out.printf("The price you've paid after tax is: $" + "%.2f", priceAfterTax);
        } catch (Exception x){
        System.out.println("Please input the price as a numerical value");
        }
    }
}
