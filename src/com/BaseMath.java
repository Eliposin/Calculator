package com;

import com.ASMD;

public class BaseMath {
	
	//Addition methods
	static double doAddition(double InputOne, double InputTwo, double InputThree)
	{
		double output = ASMD.add(InputOne, InputTwo, InputThree);
		return output;
			
	}
	
	static double doAddition(double InputOne, double InputTwo)
	{
		double output = ASMD.add(InputOne, InputTwo);
		return output;
	}
	
	//Subtraction Methods	
	static double doSubtraction(double InputOne, double InputTwo)
	{
		double output =  ASMD.sub(InputOne, InputTwo);
		return output;
	}

	static double doSubtraction(double InputOne, double InputTwo, double InputThree)

	{
		double output = ASMD.sub(InputOne, InputTwo, InputThree);
		return output;
	}
	
	
	
	//Multiplication Methods	
	static double doMultiplication(double InputOne, double InputTwo, double InputThree, double output)
	{
			
			output = ASMD.multiply(InputOne, InputTwo, InputThree);
		return output;
	}
	
	static double doMutiplication(double InputOne, double InputTwo, double output)
	{
		output = ASMD.multiply(InputOne, InputTwo);
		return output;
	}
	
	
	
	
	//Division Methods	
	static double doDivision(double InputOne, double InputTwo)
	{
		double output = ASMD.divide(InputOne, InputTwo);
		return output;
	}

	static double doDivision(double InputOne, double InputTwo, double InputThree)
	{
		double output = ASMD.divide(InputOne, InputTwo, InputThree);
		return output;
	}
	
	
	
}