package com.visa.prj.util;

public class ArrayUtil {
	public static int getSum(int[] data)
	{
		int i=0,sum=0;
		for(i=0;i<data.length;i++)
			sum+=data[i];
		return sum;
	}
	
	public static void sort(Comparable[] elems)
	{
		int i,j;
		for(i=0;i<elems.length-1;i++)
		{
			for(j=i+1;j<elems.length;j++)
			{
				if(elems[i].compareTo(elems[j])>0)
				{
					Comparable temp=elems[i];
					elems[i]=elems[j];
					elems[j]=temp;
				}
			}
		}
	}
	/**
	 * method to return number of occurances of a num in an array
	 */
	public static int getCount(int[] elems,int num) {
		int i=0,ans=0;
		for(i=0;i<elems.length;i++)
		{
			if(num==elems[i])
				ans++;
		}
		return ans;
	}
	
	public static int[] covertToArray(int[][] data) {
		int[] Ndata = new int[data.length*data[0].length];
		int n=0;
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[0].length;j++)
			{
				Ndata[n]=data[i][j];
				n++;
			}
		}
		return Ndata;
	}
}
