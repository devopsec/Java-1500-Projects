/***********************************************************************************
*     Program:  CustomerClass                                                      *
*     Created by:   DevOpSec 18-July-2016   Student: Tyler Moore                   *
*     This is the customer subclass for CustomerInfo.java                          *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class Customer extends Person
{
   private int customerNumber;
   private boolean onMailList;

   /**
   Constructor sets the person info and customer info
   @param num The customer number of the customer
   @param mail Whether or not the customer is on mail list
   */
   
   public Customer(String n, String a, long p, int num, boolean mail)
   {
      //set person superclass info
      super(n, a, p);
      
      //set customer class info
      customerNumber = num;
      onMailList = mail;
   }
   
   /**
   The setCustNum method sets the customer number
   @param num The value to set customerNumber field
   */
   
   public void setCustNum(int num)
   {
      customerNumber = num;
   }
   
   /**
   The setMailList method sets whether or not to mail customer
   @param mail The value to set the onMailList field to
   */
   
   public void setMailList(boolean mail)
   {
      onMailList = mail;
   }

   /**
   The getCustNum method gets the customer number
   @return The customerNumber field
   */
   
   public int getCustNum()
   {
      return customerNumber;
   }
   
   /**
   The getMailList method shows whether customer is on mail list
   @return The onMailList field
   */
   
   public boolean getMailList()
   {
      return onMailList;
   }
}