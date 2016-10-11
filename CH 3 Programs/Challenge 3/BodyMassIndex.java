/****************************************************************************
*  Program:  BodyMassIndex                                                  *
*  Created by:   DevOpSec 30-may-2016   Student: Tyler Moore                *
*  This program takes number input from user and outputs as roman numerals  *
*  Want to see my other projects? Check them out here: https://devopsec.net *
****************************************************************************/

import javax.swing.JOptionPane; //required for dialog box


public class BodyMassIndex
{
   public static void main(String[] args)
   {
       //declare variables
      String inputWeight, inputHeight;
      double weight, height, BMI;
      
      //display dialog box and gather data
      inputWeight = JOptionPane.showInputDialog("Enter your weight (pounds)" +
                                                " to the nearest 1/2 lb");
      weight = Double.parseDouble(inputWeight);
      inputHeight = JOptionPane.showInputDialog("Enter your height (inches)" +
                                                " to the nearest 1/2 inch");
      height = Double.parseDouble(inputHeight);
      BMI = weight * 703.0 / Math.pow(height, 2);
      
      //conditionally display BMI type
      if (BMI < 18.5)
      {
         JOptionPane.showMessageDialog(null, "Our calculations show that you" +
                                       " are underweight. Go get some of momma's" +
                                       " home cooking!");
      }
      else if (BMI >= 18.5 && BMI <= 25)
      {
         JOptionPane.showMessageDialog(null, "Our calculations show that your" +
                                       " BMI is within the optimal range. Great" +
                                       " job! Keep up the good work.");
      }
      else
      {
         JOptionPane.showMessageDialog(null, "Our calculations show that you" +
                                       " are overweight. Try changing your diet" +
                                       " or living a more active lifestyle.");
      }
      System.exit(0);
   }
}
      