/***********************************************************************************
*     Program:  PersonClass                                                        *
*     Created by:   DevOpSec 18-July-2016   Student: Tyler Moore                   *
*     This is the person superclass for CustomerInfo.java                          *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class Person
{
   private String name;
   private String address;
   private long phone;

   /**
   Constructor sets the person info
   @param n The name of the person
   @param a The address of the person
   @param p The phone number of the person
   */
   
   public Person(String n, String a, long p)
   {
      name = n;
      address = a;
      phone = p;
   }
   
   /**
   The setName method sets the persons name
   @param n The name of the person
   */
   
   public void setName(String n)
   {
      name = n;
   }
   
   /**
   The setAddress method sets the persons address
   @param a The persons address
   */
   
   public void setAddress(String a)
   {
      address = a;
   }

   /**
   The setPhone method sets the persons phone number
   @param p The persons phone number
   */
   
   public void setPhone(long p)
   {
      phone = p;
   }
   
   /**
   The getName method gets the persons name
   @return The name field
   */
   
   public String getName()
   {
      return name;
   }
   
   /**
   The getAddress method gets the persons address
   @return The address field
   */
   
   public String getAddress()
   {
      return address;
   }
   
   /**
   The getPhone method gets the persons phone number
   @return The phone field
   */
   
   public long getPhone()
   {
      return phone;
   }
}