/***********************************************************************************
*  Program:  ScanInput                                                                  *
*  Created by:  DevOpSec 13-Oct-2016   Student: Tyler Moore                        *
*  This class reads input data file and stores data for each CisClass object       *
*  Want to see my other projects? Check them out here: https://devopsec.net        *
***********************************************************************************/

package cis;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ScanInput {
	static private String dataLoc; //location of input data file
	static private ArrayList<Data> dataList; //array of data objects 
	static private int T; //number of test cases
	
	
	
	public static void init() {
		dataList = new ArrayList<Data>();
	}
	/**
	   The getInputData method gets input data from file and saves it.
	   {@value} dataList array of data objects from scanned data
	*/
	static void getInputData()
	{
		int n, k;
		ArrayList<Integer> al = new ArrayList<>();
		
		try
	    {
			File input = new File(getDataLoc());
			Scanner scan = new Scanner(input);
			
			// Read t from first line
			ScanInput.setT(scan.nextInt());
			
			// Loop through file setting other vars
			for (int i = 0; scan.hasNext(); i++)
			{
				n = scan.nextInt();
				k = scan.nextInt();
				int time; 
				
				//loop through tokens and add to arrTimes
				for (int j = 0; j < n; j++)
				{
					time = scan.nextInt();
					al.add(time);
				}
				
				// create data object for class and add to dataList
				Data dataTmp = new Data(n, k, al);
				dataList.add(i, new Data(dataTmp));
				dataTmp = null;
			}
			// close our connection
			scan.close();
		}
		
		catch (IOException eIO)
		{
			JOptionPane.showMessageDialog(null, "File IO failed");
		}
	}

	/**
	 * @return the dataLoc
	 */
	public static String getDataLoc() 
	{
		return dataLoc;
	}

	/**
	 * @param dataLoc the dataLoc to set
	 */
	public static void setDataLoc(String dataLoc) 
	{
		ScanInput.dataLoc = dataLoc;
	}
	
	/**
	 * @param  the classNum of calling CisClass object
	 * @return the corresponding Data object for that class
	 */
	public static Data getClassData(int num) 
	{
		return ScanInput.dataList.get(num);
	}

	/**
	 * @return the t
	 */
	public static int getT() {
		return T;
	}

	/**
	 * @param the t to set
	 */
	public static void setT(int t) {
		ScanInput.T = t;
	}
}
