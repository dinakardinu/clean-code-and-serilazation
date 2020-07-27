package com.MavenTask.HomeTask4;

import java.util.Scanner;

public class Construction 
{
	static int areaHouse,returnValue;
	int Construct(String str,int a)
	{
		if(str.equalsIgnoreCase("Standard material"))
			returnValue=1200*areaHouse;
		else if(str.equalsIgnoreCase("Above Standard Material"))
			returnValue=1500*areaHouse;
		else if(str.equalsIgnoreCase("High Standard Material"))
			returnValue=1800*areaHouse;
		else if(str.equalsIgnoreCase("High Standard Material and Fully automated home"))
			returnValue=2500*areaHouse;
		return returnValue;
	}

	public static void main(String[] args) {
		
		Scanner objectForScanner = new Scanner(System.in);
		Construction objectForClass=new Construction();
		String str=objectForScanner.nextLine();
		areaHouse = objectForScanner.nextInt();
		System.out.println(objectForClass.Construct(str,areaHouse));
		objectForScanner.close();

	}

}
