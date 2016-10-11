package findOutliers;

import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author devopsec
 * This program takes a data set or variable length and trims it
 * to user specified length, filtering out outliers in data set.
 */
public class Calc {
	private static ArrayList<Double> arr = new ArrayList<>();
	private static double data, mean = 0.00;
	private static int n, k = 0;
	private static double max, min, sd;
	private static List<DiffFromSD> arr2 = new ArrayList<DiffFromSD>();
	private static NumberFormat formatter = new DecimalFormat("#,###,##0.0000");
	
	public static class DiffFromSD {
		private int dpNum;
		private double dp;
		
		public DiffFromSD(int dpNum, double dp)
		{
			this.dpNum = dpNum;
			this.dp = dp;
		}
		
		public int getdpNum()
		{
			return dpNum;
		}
		
		public double getdp()
		{
			return dp;
		}

		@Override
		public String toString() 
		{
		    return "Deviation @ Data point #" + getdpNum() + ":  " + formatter.format(getdp());
		}

	}
	
	public static void main(String[] args) {
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter total number of data points"));
		k = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of data points to keep"));
		
		double sum = 0.00;
		
		for (int i = 0; i < n; i++)
		{
			data = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter data point"));
			Calc.arr.add(data);	
		}
		
		for(double d : arr)
			sum += d;
		
		mean = sum / n;
		
		//find max value
		for(int i=0; i < n; i++)
        {
            if(arr.get(i) > max)
            {
                max = arr.get(i);
            }
        }
		
		//find min value
		for(int i=0; i < n; i++)
        {
            if(arr.get(i) < min)
            {
                min = arr.get(i);
            }
        }
		
		//calc standard deviation
		for (int i=0; i < n; i++)
		{
		    sd += Math.pow((arr.get(i) - mean), 2);
		}
		sd = Math.sqrt(sd/(n-1));
		
		for (int i=0; i < arr.size(); i++)
		{
		    arr2.add(new DiffFromSD(i, (arr.get(i) - sd)));
		}
		
		//sort array by diff from SD and trim
		arr2 = arr2.stream()
        .sorted(Comparator.comparing(DiffFromSD::getdp).reversed())
        .collect(Collectors.toList());
		
		//output
		System.out.println("***Outliers Removed From Data Set***");
		for (int i=0; i < (n-k); i++)
		{
			System.out.println(arr2.get(i));
			arr2.remove(i);
		}
		System.out.println("************New Data Set************");
		for (DiffFromSD each : arr2) 
		{
			System.out.println(each);
		}
	}
}

