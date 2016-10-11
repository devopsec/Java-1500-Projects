/***********************************************************************************
*     Program:  SlotMachine                                                        *
*     Created by:   DevOpSec 20-may-2016   Student: Tyler Moore                    *
*     This program simulates a slot machine Generating randum numbers & comparing. *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

//import random number class
import java.util.Random; 
//import class for dialog boxes
import javax.swing.JOptionPane;

public class SlotMachine
{
      //declare variables
      private static int randInt1, randInt2, randInt3;
      private static String randWord1, randWord2, randWord3;
      private static int inputMoneyNum = 0, moneyWon = 0;
      private static int totalMoneyInput = 0, totalMoneyWon = 0;
      private static Random randNum1 = new Random();
      private static Random randNum2 = new Random();
      private static Random randNum3 = new Random();
      private static int playAgain = 0;
      private static String inputMoney;
      
   public static void main(String[] args)
   {
      
            
      //set loop for slot machine game
      do
      {
         //ask user how much to bet
         inputMoney = JOptionPane.showInputDialog(null, "Enter amount to bet($)", 
                                              "Match 2 or more and WIN!!",
                                              JOptionPane.QUESTION_MESSAGE);

         if (inputMoney != null)
         {
            //grab input, generate randum #'s 0-5, display corresponding fruit
            inputMoneyNum = Integer.parseInt(inputMoney);
            randInt1 = randNum1.nextInt(6);
            switch (randInt1)
            {
               case 0:
               randWord1 = "Cherries";
               break;
               
               case 1:
               randWord1 = "Oranges";
               break;
               
               case 2:
               randWord1 = "Plums";
               break;
               
               case 3:
               randWord1 = "Bells";
               break;
               
               case 4:
               randWord1 = "Melons";
               break;
               
               case 5:
               randWord1 = "Bars";
               break;
               
               default:
               randWord1 = "Invalid #";
            }
            randInt2 = randNum2.nextInt(6);
            switch (randInt2)
            {
               case 0:
               randWord2 = "Cherries";
               break;
               
               case 1:
               randWord2 = "Oranges";
               break;
               
               case 2:
               randWord2 = "Plums";
               break;
               
               case 3:
               randWord2 = "Bells";
               break;
               
               case 4:
               randWord2 = "Melons";
               break;
               
               case 5:
               randWord2 = "Bars";
               break;
               
               default:
               randWord2 = "Invalid #";
            }
            randInt3 = randNum3.nextInt(6);
            switch (randInt3)
            {
               case 0:
               randWord3 = "Cherries";
               break;
               
               case 1:
               randWord3 = "Oranges";
               break;
               
               case 2:
               randWord3 = "Plums";
               break;
               
               case 3:
               randWord3 = "Bells";
               break;
               
               case 4:
               randWord3 = "Melons";
               break;
               
               case 5:
               randWord3 = "Bars";
               break;
               
               default:
               randWord3 = "Invalid #";
            }
            
            //display words in place of random numbers
            JOptionPane.showMessageDialog(null, "Here's your results:\n" +
                                         randWord1 + "   " + randWord2 + "   "
                                         + randWord3, "Match 2 or more and WIN!!",
                                         JOptionPane.QUESTION_MESSAGE);
                                                   
            //compare rand nums & update running totals & display $ won
            if (randInt1 == randInt2 && randInt1 == randInt3)
            {
               moneyWon = inputMoneyNum * 3;
               totalMoneyWon += moneyWon;
               totalMoneyInput += inputMoneyNum;
               JOptionPane.showMessageDialog(null, "Jackpot!\n" + "You won $" + 
                                             moneyWon, "Match 2 or more and WIN!!",
                                             JOptionPane.WARNING_MESSAGE);                                             
            }
            else if (randInt1 == randInt2)
            {
               moneyWon = inputMoneyNum * 2;
               totalMoneyWon += moneyWon;
               totalMoneyInput += inputMoneyNum;
               JOptionPane.showMessageDialog(null, "You matched 2!\n" + "You won $" + 
                                             moneyWon, "Match 2 or more and WIN!!",
                                             JOptionPane.WARNING_MESSAGE);
            }
            else if (randInt1 == randInt3)
            {
               moneyWon = inputMoneyNum * 2;
               totalMoneyWon += moneyWon;
               totalMoneyInput += inputMoneyNum;
               JOptionPane.showMessageDialog(null, "You matched 2!\n" + "You won $" + 
                                             moneyWon, "Match 2 or more and WIN!!",
                                             JOptionPane.WARNING_MESSAGE);
            }
            else if (randInt2 == randInt3)
            {
               moneyWon = inputMoneyNum * 2;
               totalMoneyWon += moneyWon;
               totalMoneyInput += inputMoneyNum;
               JOptionPane.showMessageDialog(null, "You matched 2!\n" + "You won $" + 
                                             moneyWon, "Match 2 or more and WIN!!",
                                             JOptionPane.WARNING_MESSAGE);
            }
            else
            {
               moneyWon = 0;
               totalMoneyWon += moneyWon;
               totalMoneyInput += inputMoneyNum;
               JOptionPane.showMessageDialog(null, "No matches.\n" + "You won $" + 
                                             moneyWon, "Match 2 or more and WIN!!",
                                             JOptionPane.WARNING_MESSAGE);
            }
            //ask user to continue or exit & loop if continue
            playAgain = JOptionPane.showConfirmDialog(null, "Do you want to " + 
                                                         "play again?\n", "Match 2" + 
                                                         " or more and WIN!!", 
                                                         JOptionPane.YES_NO_OPTION);
            if (playAgain == JOptionPane.YES_OPTION) 
            {
               continue;
            }
            else 
            {
               JOptionPane.showMessageDialog(null, "Total won: $" + totalMoneyWon +
                                             "\n" + "Total input: $" + totalMoneyInput);
               System.exit(0);
            }
         }
         else if (inputMoney == null)
         {
            JOptionPane.showMessageDialog(null, "Total won: $" + totalMoneyWon +
                                             "\n" + "Total input: $" + totalMoneyInput);
            System.exit(0);
         }
         else
         {
            JOptionPane.showMessageDialog(null, "The amount you entered is invalid\n" +
                                          "Try entering a valid number (dollars)",  
                                          "Match 2 or more and WIN!!",
                                          JOptionPane.WARNING_MESSAGE);   
         } 
      } while (playAgain != JOptionPane.NO_OPTION);                                                                                                
   } 
}