/***********************************************************************************
*     Program:  CarProgram                                                         *
*     Created by:   DevOpSec 11-July-2016   Student: Tyler Moore                   *
*     This program creates instances of the car class and changes car speed        *
*     Want to see my other projects? Check them out here: https://devopsec.net     *
***********************************************************************************/

public class CarProgram
{
   public static void main(String[] args)
   {
      //create an instance of Car class
      Car mustang = new Car(1968, "Ford");
      mustang.accelerate();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.accelerate();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.accelerate();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.accelerate();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.accelerate();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.brake();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.brake();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.brake();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.brake();
      System.out.println("speed = " + mustang.getSpeed());
      mustang.brake();
      System.out.println("speed = " + mustang.getSpeed());
   }
}