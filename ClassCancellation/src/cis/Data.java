/***********************************************************************************
*  Program:  Data                                                                  *
*  Created by:  DevOpSec 13-Oct-2016   Student: Tyler Moore                        *
*  This class allows Data object creation to store data for each CisClass object   *
*  Want to see my other projects? Check them out here: https://devopsec.net        *
***********************************************************************************/

package cis;

import java.util.ArrayList;

class Data {
	private int numStuds, threshold;
	private ArrayList<Integer> arrTimes;
	
	/**
	   Constructor
	   @param n The number of students in that class
	   @param k The cancellation threshold for class
	   @param al The times students arrived to class
	*/
	
	public Data(int n, int k, ArrayList<Integer> al)
	{
		numStuds = n;
		threshold = k;
		arrTimes = al;
	}
	
	/**
	   Copy Constructor
	*/
	 
	public Data(Data old)
	{
		numStuds = old.getNumStuds();
		threshold = old.getThreshold();
		arrTimes = old.getArrTimes();
	}

	/**
	 * @return the arrTimes
	 */
	public ArrayList<Integer> getArrTimes() {
		return arrTimes;
	}

	/**
	 * @return the numStuds
	 */
	public int getNumStuds() {
		return numStuds;
	}

	/**
	 * @return the threshold
	 */
	public int getThreshold() {
		return threshold;
	}
	
	/**
    The isClassCancelled method checks if that class matches
    the constraints for cancelling informs user of result
    @return String description, if class is or not cancelled
    */
    
    public boolean isClassCancelled()
    {
	    boolean result;
	    
	    //loop through arrival times and 
	    if (getNumPresent() < threshold)
	    {
	    	result = true;
	    }
	    else
	    {
	    	result = false;
	    }
	    
	    return result;
    }

     /**
	 * @return the number of on-time students
	 */
	public byte getNumPresent() 
	{
		byte z = 0, numPresent = 0;
		
		while (z < numStuds)
		{
			if (getArrTimes().get(z) <= 0)
			{
				numPresent++;
			}
			z++;
		}
		
		return numPresent;
	}
}
