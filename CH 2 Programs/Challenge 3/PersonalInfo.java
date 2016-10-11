/************************************************
*  Application Name: PersonalInfo.java          *
*  Created By: DevOpSec , 18-May-2016           *
*  This app stores & displays personal info     *
************************************************/

public class PersonalInfo
{
   public static void main(String[] args)
   {
   //declare vars and store data in them
   String name = "Name: Tyler";
   String address = "Address: 12345 Fake Address Dr, Somewhere, World, 12345-6789";
   String phone = "Phone: 012-345-6789";
   String major = "Major: Software Engineering & Cyber Security";
   //prints vars in one statement, all on seperate lines
   System.out.println(name + "\n" + address + "\n" + phone + "\n" + major);
   }
}