package com.mycompany.lab1;

import javax.swing.JOptionPane;

public class Problem8Main {

    public static void main(String[] args) {
        int servingSize = 4;
        int caloriesPerServing = 300;
        String howManyYouveAte = JOptionPane.showInputDialog("Please input the number of cookies you ate.");
        try 
        {
           float howManyYouveAteFloat = Float.parseFloat(howManyYouveAte);
           float caloriesYouveConsumed = howManyYouveAteFloat / servingSize * caloriesPerServing;
           System.out.println("You have consumed: " + caloriesYouveConsumed + " calories worth of cookies.");
           if (caloriesYouveConsumed > 2000)
           {
               System.out.println("You have consumed enough cookies to constitute an entire day of eating. Yikes.");
           }
        }   catch (Exception x) 
        {
            System.out.println("Please input that number as a numerical value.");
        }

    }
}
