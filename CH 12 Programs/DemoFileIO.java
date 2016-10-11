

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class DemoFileIO
{
   public static void main(String [] args)
   {
      MyFrame frame = new MyFrame("Alan Window");
      frame.setSize(400, 300);
      frame.setLocation(100, 75);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class MyFrame extends JFrame
{
   JButton toFile = new JButton("To File");
   JCheckBox loveJava = new JCheckBox("I Love Java!");
   JButton showMe = new JButton("Show Me");

   public MyFrame(String s)
   {
      super(s);
      setLayout(new FlowLayout());
   
      add(loveJava);
      add(toFile);
      add(showMe);
      toFile.addActionListener(new ToFileHandler());
      showMe.addActionListener(new ShowMeHandler());
   }
   
   class ToFileHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if (loveJava.isSelected() == true)
         {
            //JOptionPane.showMessageDialog(null, "I love java is checked");
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("love.txt");
               
               // Write to the file  "Love_Java"
               out.println("Love_Java");
               
               // Close the connection
               out.close();
            }
            catch(Exception exc)
            {
               JOptionPane.showMessageDialog(null, "Could not open file");
            }
         }
         else
         {
            //JOptionPane.showMessageDialog(null, "I love java is NOT checked");
            try
            {
               // Create a connection to the file
               PrintWriter out = new PrintWriter("love.txt");
               
               // Write to the file  "Love_Java"
               out.println("Not_Loving_It");
               
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
   
   class ShowMeHandler implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         try
         {
            // Create a reading connection to the file
            Scanner scan = new Scanner(new File("love.txt"));
            
            // Read a line from the file
            String firstLine = scan.nextLine();
            JOptionPane.showMessageDialog(null, "Show Me Just Read: " + firstLine);
           
            if (firstLine.equals("Love_Java"))
               loveJava.setSelected(true);
            else
               loveJava.setSelected(false);
               
            // close our connection
            scan.close();
         }
         catch (Exception exc)
         {
            JOptionPane.showMessageDialog(null, "Something bad happened");
         }
      }
   }

}
