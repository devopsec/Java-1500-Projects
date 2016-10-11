/********************************************************************************
*  Program:  DiceGame                                                           *
*  Created by:   DevOpSec 15-may-2016   Student: Tyler Moore                    *
*  This program randomly generates 10 die rolls for pc & user. Best of 10 wins  *
*  Want to see my other projects? Check them out here: https://devopsec.net     *
********************************************************************************/

//import random number class
import java.util.Random; 
//import class for dialog boxes
import javax.swing.JOptionPane;

public class DiceGame
{
   public static void main(String[] args)
   {
       //declare variables
      int computerTotalWins = 0, userTotalWins = 0, tiesTotal = 0;
      int computerRandInt, userRandInt, dialogOption;
      Random computerRandNum = new Random();
      Random userRandNum = new Random();
      
      //ask user to roll dice
      dialogOption = JOptionPane.showConfirmDialog(null, "Do you want to roll your "+
                                                   "dice and beat the computer? 10" +
                                                   " rolls each, best of 10 wins..");
      if (dialogOption == JOptionPane.YES_OPTION)
      {
      //if yes, initiate a for loop
         for (int i = 0; i < 10; i++)
         {
            //generate random #'s between 1-6
            computerRandInt = computerRandNum.nextInt(6) + 1;
            userRandInt = userRandNum.nextInt(6) + 1;
            if (userRandInt < computerRandInt)
               computerTotalWins++;
            else if (userRandInt > computerRandInt)
               userTotalWins++;
            else if (userRandInt == computerRandInt)
               tiesTotal++;
         }
         //display scores and who won
         if (computerTotalWins > userTotalWins)
         {
            JOptionPane.showMessageDialog(null, "Sorry, the computer won.\n" +
                                          "Your score: " + userTotalWins + "\n" + 
                                          "Computer's score: " + computerTotalWins+
                                          "\nTotal ties: " + tiesTotal);
         }
         else if (computerTotalWins < userTotalWins)
         {
            JOptionPane.showMessageDialog(null, "Congrats!! You won!\n" +
                                          "Your score: " + userTotalWins + "\n" + 
                                          "Computer's score: " + computerTotalWins+
                                          "\nTotal ties: " + tiesTotal);
         }
         else if (computerTotalWins == userTotalWins)
         {
            JOptionPane.showMessageDialog(null, "Looks like a tie...\n" +
                                          "Your score: " + userTotalWins + "\n" + 
                                          "Computer's score: " + computerTotalWins+
                                          "\nTotal ties: " + tiesTotal);
         }
         System.exit(0);
      }
      else if (dialogOption == JOptionPane.NO_OPTION)
      {
      System.exit(0);
      }
      else if (dialogOption == JOptionPane.CANCEL_OPTION)
      {
      System.exit(0);
      } 
   }
}
