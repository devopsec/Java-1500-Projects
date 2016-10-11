/*************************************************************************************
*     Program:  CustomerInfo                                                         *
*     Created by:   DevOpSec 18-July-2016   Student: Tyler Moore                     *
*     This program allows accounting of customer info                                *
*     Want to see my other projects? Check them out here: https://devopsec.net       *
*************************************************************************************/

//import class for dialog boxes
import javax.swing.JOptionPane;
      
public class CustomerInfo
{
   public static void main(String[] args)
   {
      //declare variables
      int inputInfo = 0, inputPrefCust = 0; //conditional vars
      String inputN, inputA; //collect user input
      String inputP0; //collect user input
      long inputP1; //convert to long
      String inputNum0; //collect user input
      int inputNum1; //convert to int
      int inputMail0; //collect user input
      boolean inputMail1; //collect user input
      String inputTotPurch0; //collect user input
      double inputTotPurch1; //convert to double
      
      //create an instance of Customer class
      Customer cust0001 = new Customer("Bill", "123 Fake St", 1234567890, 0001, false);
      
      //demonstrate customer object
      System.out.println("Demonstrating Customer class from challenge #7.");
      cust0001.setMailList(true);
      System.out.println("Customer is on mail list? " + cust0001.getMailList());
      cust0001.setAddress("It's 5 O'Clock Somewhere Dr, Margaritaville");
      cust0001.setName("Jimmy Buffet");
      System.out.println("Customer is " + cust0001.getName() + "\n" + "He lives at: "
                         + cust0001.getAddress() + "\n" + "His number is " + 
                         cust0001.getPhone());
                         
      //demonstrate PreferredCustomer class & program
      System.out.println("Demonstrating PreferredCustomer class from challenge #8.");
      
      //ask user if they have customer info to input (loop or exit)
      do
      {
         inputInfo = JOptionPane.showConfirmDialog(null, "Do you have customer info to" 
                                                   + " input?\n", "Input Customer Info", 
                                                   JOptionPane.YES_NO_OPTION);
         if (inputInfo == JOptionPane.YES_OPTION) 
         {
            continue;
         }
         else 
         {
            JOptionPane.showMessageDialog(null, "Your customer data has been saved.");
            System.exit(0);
         }
         
         //ask user if customer is preferred
         inputPrefCust = JOptionPane.showConfirmDialog(null, "Is this a preferred customer?" 
                                                   + " input?\n", "Input Customer Info", 
                                                   JOptionPane.YES_NO_OPTION);
         if (inputPrefCust == JOptionPane.YES_OPTION) 
         {
           //ask user for customer name
           inputN = JOptionPane.showInputDialog(null, "What is the customer's name?", 
                                                "Input Customer Info",
                                                JOptionPane.QUESTION_MESSAGE);
           //ask user for customer address
           inputA = JOptionPane.showInputDialog(null, "What is the customer's address?", 
                                                "Input Customer Info",
                                                JOptionPane.QUESTION_MESSAGE);
           //ask user for customer phone #
           inputP0 = JOptionPane.showInputDialog(null, "What is the customer's phone#?", 
                                                "Input Customer Info (no dashes)",
                                                JOptionPane.QUESTION_MESSAGE);
           inputP1 = Long.parseLong(inputP0);
           //ask user for customer number
           inputNum0 = JOptionPane.showInputDialog(null, "What is the customer's id#?", 
                                                 "Input Customer Info",
                                                 JOptionPane.QUESTION_MESSAGE);
           inputNum1 = Integer.parseInt(inputNum0);
           //ask user if customer on mail list
           inputMail0 = JOptionPane.showConfirmDialog(null, "Is customer on mail list?", 
                                                    "Input Customer Info", 
                                                    JOptionPane.YES_NO_OPTION);
           switch (inputMail0)
           {
              case 1:
                 inputMail1 = true;
                 break;
              default:
                 inputMail1 = false;
           }
           
           //create instance of PreferredCustomer class         
           PreferredCustomer customer = new PreferredCustomer(inputN, inputA, inputP1, 
                                                              inputNum1, inputMail1);
           //ask user for total $ customer has spent, if any yet
           inputTotPurch0 = JOptionPane.showInputDialog(null, "How much has the customer " + 
                                                      "purchased, if any? (include cents)",
                                                      "Input Customer Info",
                                                      JOptionPane.QUESTION_MESSAGE);
           inputTotPurch1 = Double.parseDouble(inputTotPurch0);                                           
           
           //set total purchases and conditionally set discount level
           customer.setTotalPurch(inputTotPurch1);
           if (customer.getTotalPurch() >= 500.00 && customer.getTotalPurch() < 1000.00)
           {
              customer.setDscntLvl(5);
           }
           else if (customer.getTotalPurch() >= 1000.00 && customer.getTotalPurch() < 1500.00)
           {
              customer.setDscntLvl(6);
           }
           else if (customer.getTotalPurch() >= 1500.00 && customer.getTotalPurch() < 2000.00)
           {
              customer.setDscntLvl(7);
           }
           else if (customer.getTotalPurch() >= 2000.00)
           {
              customer.setDscntLvl(10);
           }
           else
           {
              continue;
           }
           
           //demonstrate PreferredCustomer object
           System.out.println("Demonstrating right meowwwwwwwwwwwwwwwwwwwwwwwwwww.");
           System.out.println("Customer is on mail list? " + customer.getMailList());
           System.out.println("How much has the customer spent? " + customer.getTotalPurch());
           System.out.println("What is the customers discount level?" + customer.getDscntLvl());
           System.out.println("What is the customers name? " + customer.getName());
         }
         else if (inputPrefCust == JOptionPane.NO_OPTION) 
         {
           //ask user for customer name
           inputN = JOptionPane.showInputDialog(null, "What is the customer's name?", 
                                                "Input Customer Info",
                                                JOptionPane.QUESTION_MESSAGE);
           //ask user for customer address
           inputA = JOptionPane.showInputDialog(null, "What is the customer's address?", 
                                                "Input Customer Info",
                                                JOptionPane.QUESTION_MESSAGE);
           //ask user for customer phone #
           inputP0 = JOptionPane.showInputDialog(null, "What is the customer's phone#?", 
                                                "Input Customer Info (no dashes)",
                                                JOptionPane.QUESTION_MESSAGE);
           inputP1 = Long.parseLong(inputP0);
           //ask user for customer number
           inputNum0 = JOptionPane.showInputDialog(null, "What is the customer's id#?", 
                                                 "Input Customer Info",
                                                 JOptionPane.QUESTION_MESSAGE);
           inputNum1 = Integer.parseInt(inputNum0);
           //ask user if customer on mail list
           inputMail0 = JOptionPane.showConfirmDialog(null, "Is customer on mail list?", 
                                                    "Input Customer Info", 
                                                    JOptionPane.YES_NO_OPTION);
           switch (inputMail0)
           {
              case 1:
                 inputMail1 = true;
                 break;
              default:
                 inputMail1 = false;
           }
           
           //create instance of Customer class         
           Customer customer = new Customer(inputN, inputA, inputP1, inputNum1, inputMail1);
          
         }
         else 
         {
            JOptionPane.showMessageDialog(null, "Your customer data has been saved.");
            System.exit(0);
         }
      } while (inputInfo != JOptionPane.NO_OPTION); 
   }
}