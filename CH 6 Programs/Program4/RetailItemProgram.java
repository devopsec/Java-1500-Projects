/***********************************************************************************
*     Program:  RetailItemProgram                                                  *
*     Created by:   DevOpSec 11-July-2016   Student: Tyler Moore                   *
*     This program creates a RetailItem class that holds inventory data            *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class RetailItemProgram
{
   public static void main(String[] args)
   {
   //create an instance of RetailItem class
   RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
   RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
   RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
   //print item descriptions as an example
   System.out.println("item1 = " + item1.getDescription());
   System.out.println("item2 = " + item2.getDescription());
   System.out.println("item3 = " + item3.getDescription());
   }
}