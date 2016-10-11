/***********************************************************************************
*     Program:  RetailItemClass                                                    *
*     Created by:   DevOpSec 11-July-2016   Student: Tyler Moore                   *
*     This program creates a RetailItem class that holds inventory data            *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class RetailItem
{
   private String description;
   private int unitsOnHand;
   private double price;

   /**
   Constructor
   @param descr The description of the item
   @param units The number of that item in stock
   @param prc The price of that item
   */
   
   public RetailItem(String descr, int units, double prc)
   {
      description = descr;
      unitsOnHand = units;
      price = prc;
   }
   
   /**
   The setDescription method changes the item description
   @param descr The description field
   */
   
   public void setDescription(String descr)
   {
      description = descr;
   }
   
   /**
   The setUnitsOnHand method changes number of item in stock
   @param units The unitsOnHand field
   */
   
   public void setDescription(int units)
   {
      unitsOnHand = units;
   }
   
   /**
   The setPrice method changes the price of item
   @param prc The price field   
   */
   
   public void setDescription(double prc)
   {
      price = prc;
   }
   
   /**
   The getDescription method gets the item description
   @return The description field
   */
   
   public String getDescription()
   {
      return description;
   }
   
   /**
   The getUnitsOnHand method gets the number of item in stock
   @return The unitsOnHand field
   */
   
   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }
   
   /**
   The getPrice method gets the price of that item
   @return The price field
   */
   
   public double getPrice()
   {
      return price;
   }
   
}