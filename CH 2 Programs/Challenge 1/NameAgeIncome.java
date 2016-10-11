/*****************************************************************************
*   Program: NameAgeIncome.java                                              *
*   Created by: DevOpSec 16-may-2016. Student: Tyler Moore.                  *
*   This program stores and displays my name, age, and desired annualPay.    *
*****************************************************************************/

public class NameAgeIncome
{
   public static void main (String[]args)
   {
   
   //declare & initialize variable name as a string
   String name = "Tyler";
   
   //declare & initialize variable age as an int
   int age = 23;
   
   //declare & initialize variable annualPay as a double
   double annualPay = 100000.00;
   
   //output values to console
   System.out.println("What's up fellow developers, it's me " + name + "."); 
   System.out.println("I am " + age + " years young and an available bachelor. :D ");
   System.out.println("When I create the next \"Pied Piper\" I will earn $" + annualPay + 
                      " and will blow it all on computers!");
   }
}