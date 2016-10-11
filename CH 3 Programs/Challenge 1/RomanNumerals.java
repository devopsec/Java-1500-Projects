/****************************************************************************
*  Program:  RomanNumerals                                                  *
*  Created by:   DevOpSec 30-may-2016   Student: Tyler Moore                *
*  This program takes number input from user and outputs as roman numerals  *
*  Want to see my other projects? Check them out here: https://devopsec.net *
****************************************************************************/

import javax.swing.JOptionPane; //required for dialog box


public class RomanNumerals
{
   public static void main(String[] args)
   {
      //declare variables
      String input;
      byte inputNum;
      
      //display dialog box and gather input
      input = JOptionPane.showInputDialog("Enter a number from 1 - 10.");
      inputNum = Byte.parseByte(input);
      
      //conditional execution of roman numeral conversion
      if (inputNum >= 1 && inputNum <= 10)
      {
         //conversion to roman numerals by case
         switch (inputNum)
         {
            case 1:
            JOptionPane.showMessageDialog(null, "You entered: I");
            break;
            
            case 2:
            JOptionPane.showMessageDialog(null, "You entered: II");
            break;
            
            case 3:
            JOptionPane.showMessageDialog(null, "You entered: III");
            break;
            
            case 4:
            JOptionPane.showMessageDialog(null, "You entered: IV");
            break;
            
            case 5:
            JOptionPane.showMessageDialog(null, "You entered: V");
            break;
            
            case 6:
            JOptionPane.showMessageDialog(null, "You entered: VI");
            break;
            
            case 7:
            JOptionPane.showMessageDialog(null, "You entered: VII");
            break;
            
            case 8:
            JOptionPane.showMessageDialog(null, "You entered: VIII");
            break;
            
            case 9:
            JOptionPane.showMessageDialog(null, "You entered: IX");
            break;
            
            case 10:
            JOptionPane.showMessageDialog(null, "You entered: X");
            break; 
         }
      }   
      //catch error if not in correct range
      else
      {
         JOptionPane.showMessageDialog(null, "That is not a valid number");
      }
      System.exit(0);
   }
}