/***********************************************************************************
*     Program:  CarClass                                                           *
*     Created by:   DevOpSec 11-July-2016   Student: Tyler Moore                   *
*     This program creates a car class and creates an object and calls a method    *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class Car
{
   private int yearModel;
   private String make;
   private int speed;

   /**
   Constructor
   @param yr The year the car was made
   @param mk The make of the car
   */
   
   public Car(int yr, String mk)
   {
      yearModel = yr;
      make = mk;
      speed = 0;
   }
   
   /**
   The getModel method gets the cars model
   @return The yearModel field
   */
   
   public int getModel()
   {
      return yearModel;
   }
   
   /**
   The getMake method gets the cars make
   @return The make field
   */
   
   public String getMake()
   {
      return make;
   }
   
   /**
   The getSpeed method gets the cars current speed
   @return The speed field
   */
   
   public int getSpeed()
   {
      return speed;
   }
   
   /**
   The accelerate method increases the cars speed
   @param spd The cars speed
   */
   
   public void accelerate()
   {
      int spd = getSpeed();
      spd += 5;
      speed = spd;
   }
   
   /**
   The brake method decreases the cars speed
   @param spd The cars speed
   */
   
   public void brake()
   {
      int spd = getSpeed();
      spd -= 5;
      speed = spd;
   }
}