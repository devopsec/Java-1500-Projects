/*************************************************************************************
*     Program:  IceCreamOrder                                                        *
*     Created by:   DevOpSec 08-Aug-2016   Student: Tyler Moore                      *
*     This program allows a customer to order ice cream and accounts for transaction *
*     Want to see my other projects? Check them out here: https://devopsec.net       *
*************************************************************************************/

import java.awt.*; //awt components
import java.awt.event.*; //awt event listener
import javax.swing.*; //swing components
import java.io.*; //input&output
import java.util.*; //utils

public class IceCreamOrder
{
   public static void main(String [] args)
   {
      MyFrame frame = new MyFrame("Ice Cream Order");
      //frame.setSize(400, 300);
      frame.setLocation(600, 250);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}

class MyFrame extends JFrame
{
   JPanel masterPanel = new JPanel();

   JPanel panelIceCream = new JPanel();
   JRadioButton vanilla = new JRadioButton("Vanilla", true);
   JRadioButton chocolate = new JRadioButton("Chocolate");
   JRadioButton strawberry = new JRadioButton("Strawberry");
   ButtonGroup group = new ButtonGroup();
   
   JPanel panelExtras = new JPanel();
   JCheckBox nuts = new JCheckBox("nuts");
   JCheckBox cherries = new JCheckBox("cherries");
   
   JPanel panelProcess = new JPanel();
   JButton restore = new JButton("restore");
   JButton save = new JButton("save");
   JButton calculate = new JButton("calculate cost");

   public MyFrame(String s)
   {
      super(s);
      
      //group radiobuttons
      group.add(vanilla);
      group.add(chocolate);
      group.add(strawberry);
      //add radio buttons to panel
      panelIceCream.add(vanilla);
      panelIceCream.add(chocolate);
      panelIceCream.add(strawberry);
      //add checkboxes to panel
      panelExtras.add(nuts);
      panelExtras.add(cherries);
      //add buttons to panel
      panelProcess.add(restore);
      panelProcess.add(save);
      panelProcess.add(calculate);
      //add panels
      masterPanel.add(panelIceCream);
      masterPanel.add(panelExtras);
      masterPanel.add(panelProcess);
      add(masterPanel);
      //set borders on panels
      panelIceCream.setBorder(BorderFactory.createTitledBorder("Flavor"));
      panelProcess.setBorder(BorderFactory.createTitledBorder("Transaction"));
      panelExtras.setBorder(BorderFactory.createTitledBorder("Extras"));
      
      //add action listeners
      save.addActionListener(new SaveFile());
      restore.addActionListener(new RestoreFile());
      calculate.addActionListener(new Calculate());
   }
   
    class SaveFile implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (vanilla.isSelected() == true && nuts.isSelected() == false && cherries.isSelected() == false)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file "flavor" and "extras"
               out.println("vanilla");
               out.println("none");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (chocolate.isSelected() == true && nuts.isSelected() == false && cherries.isSelected() == false)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("chocolate");
               out.println("none");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (strawberry.isSelected() == true && nuts.isSelected() == false && cherries.isSelected() == false)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("strawberry");
               out.println("none");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (vanilla.isSelected() == true && nuts.isSelected() == true && cherries.isSelected() == false)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("vanilla");
               out.println("nuts");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (vanilla.isSelected() == true && nuts.isSelected() == true && cherries.isSelected() == true)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("vanilla");
               out.println("nuts&cherries");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (chocolate.isSelected() == true && nuts.isSelected() == true && cherries.isSelected() == false)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("chocolate");
               out.println("nuts");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (chocolate.isSelected() == true && nuts.isSelected() == true && cherries.isSelected()== true)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("chocolate");
               out.println("nuts&cherries");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (strawberry.isSelected() == true && nuts.isSelected() == true && cherries.isSelected() == false)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("strawberry");
               out.println("nuts");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else if (strawberry.isSelected() == true && nuts.isSelected() == true && cherries.isSelected() == true)
         {
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("icecreamData.txt");
               
               // Write to the file  "flavor" and "extras"
               out.println("strawberry");
               out.println("nuts&cherries");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
      }
   }
   
   class RestoreFile implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Create a reading connection to the file
            Scanner scan = new Scanner(new File("icecreamData.txt"));
            
            // Read a line from the file
            String firstLine = scan.nextLine();
            String secondLine = scan.nextLine();
            JOptionPane.showMessageDialog(null, "Your saved order: \n" + 
                                          "Flavor: " + firstLine + "\n" +
                                          "Extras: " + secondLine);
            //conditional set flavor
            if (firstLine.equals("vanilla"))
               {
               vanilla.setSelected(true);
               }
            else if (firstLine.equals("chocolate"))
               {
               chocolate.setSelected(true);
               }
            else if (firstLine.equals("strawberry"))
               {
               strawberry.setSelected(true);
               }
               
            //conditional set extras
            if (secondLine.equals("none"))
               {
               nuts.setSelected(false);
               cherries.setSelected(false);
               }
            else if (secondLine.equals("nuts"))
               {
               nuts.setSelected(true);
               cherries.setSelected(false);
               }
            else if (secondLine.equals("cherries"))
               {
               nuts.setSelected(false);
               cherries.setSelected(true);
               }
            else if (secondLine.equals("nuts&cherries"))
               {
               nuts.setSelected(true);
               cherries.setSelected(true);
               }
               
            // close our connection
            scan.close();
         }
         catch (Exception exc)
         {
            JOptionPane.showMessageDialog(null, "Something bad happened");
         }
      }
   }
   
   class Calculate implements ActionListener
   {
      private final double baseCost = 2.25;
      private final double extraCost = 0.50;
      private final double salesTax = 0.06;
      private double saleCost = 0.00;
      private double saleTax = 0.00;
      private double saleTotal = 0.00;
      
      public void actionPerformed(ActionEvent e)
      {
         if (nuts.isSelected() == true || cherries.isSelected() == true)
         {
            saleCost = baseCost + extraCost;
            saleTax = saleCost * salesTax;
            saleTotal = saleCost + saleTax;
            
            
                                          
            JOptionPane.showMessageDialog(null, String.format("Your Order\nCost: $%.2f\nTax: $%.2f\nTotal: $%.2f ",
                                          saleCost, saleTax, saleTotal));
            
         }
         else if (nuts.isSelected() == true && cherries.isSelected() == true)
         {
            saleCost = baseCost + (extraCost * 2);
            saleTax = saleCost * salesTax;
            saleTotal = saleCost + saleTax;
            
            JOptionPane.showMessageDialog(null, "Your Order\n" +
                                          "Cost: " + saleCost + "\n" +
                                          "Tax: " + saleTax + "\n" +
                                          "Total: " + saleTotal);
         }
         else
         {
            saleCost = baseCost;
            saleTax = saleCost * salesTax;
            saleTotal = saleCost + saleTax;
            
            JOptionPane.showMessageDialog(null, "Your Order" +
                                          "Cost: " + saleCost + "\n" +
                                          "Tax: " + saleTax + "\n" +
                                          "Total: " + saleTotal);
         }
      }
   }

}