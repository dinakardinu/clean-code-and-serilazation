package com.MavenTask.HomeTask4;

import java.util.Scanner;

public class InterestCalculater 
{
	static int timePeriod,principal,rateOfInterest,numberOfTimeInterest;
	float simple(int principal,int timePeriod,int rateOfInterest)
	{
		float ans=(principal*timePeriod*rateOfInterest)/100;
		return ans;
	}
	double compond(int principal,int timePeriod,int rateOfInterest,int numberOfTimeInterest) 
	{
		float ans1 = 1+(rateOfInterest/numberOfTimeInterest);
		float storeValue = numberOfTimeInterest*timePeriod;
		double powerCalculate = Math.pow(ans1,storeValue);
		double compoundInterest = principal*powerCalculate;
		return compoundInterest;
	}

	public static void main(String args[])
	{
			Scanner objectForScannerClass=new Scanner(System.in);
			InterestCalculater objectForClass=new InterestCalculater();
			principal=objectForScannerClass.nextInt();
			timePeriod=objectForScannerClass.nextInt();
			rateOfInterest=objectForScannerClass.nextInt();
			numberOfTimeInterest=objectForScannerClass.nextInt();
			System.out.println(objectForClass.simple(principal,timePeriod,rateOfInterest));
			System.out.println(objectForClass.compond(principal,timePeriod,rateOfInterest,numberOfTimeInterest));
			objectForScannerClass.close();
	}
}
