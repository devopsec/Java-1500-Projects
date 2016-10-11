/***********************************************************************************
*     Program:  PreferredCustomerClass                                             *
*     Created by:   DevOpSec 18-July-2016   Student: Tyler Moore                   *
*     This is the preferredcustomer subclass for CustomerInfo.java                 *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class PreferredCustomer extends Customer
{
   private double totalPurch;
   private int dscntLvl;

   /**
   Constructor sets the person info, customer info, and preferred info
   @param n The name of the person
   @param a The address of the person
   @param p The phone number of the person
   @param num The customer number of the customer
   @param mail Whether or not the customer is on mail list
   @param totalPurch The total amount of $ spent by customer
   @param dscnt The percent discount for that customer
   */
   
   public PreferredCustomer(String n, String a, long p, int num, boolean mail)
   {
      //set customer superclass info
      super(n, a, p, num, mail);
      
      //set preferredcustomer class info to default
      totalPurch = 0.00;
      dscntLvl = 0;
   }
   
   /**
   The setTotalPurch method sets the total amount $ spent by customer
   @param purch The value to set totalPurch field
   */
   
   protected void setTotalPurch(double purch)
   {
      totalPurch = purch;
   }
   
   /**
   The setDscntLvl method sets the percent discount for that customer
   @param dscnt The value to set the dscntLvl field to
   */
   
   protected void setDscntLvl(int dscnt)
   {
      dscntLvl = dscnt;
   }

   /**
   The getTotalPurch method gets the total amount $ spent by customer
   @return The totalPurch field
   */
   
   public double getTotalPurch()
   {
      return totalPurch;
   }
   
   /**
   The getMailList method gets the percent discount for that customer
   @return The dscntLvl field
   */
   
   public int getDscntLvl()
   {
      return dscntLvl;
   }
}