package com;

public class ASMD {

	static double add(double InputOne, double InputTwo, double InputThree)
	{
		double output = 0;
		output = (double)InputOne + (double)InputTwo + (double)InputThree;
	return output;
	}
	
	static double add(double InputOne, double InputTwo)
	{
		double output = 0;
		output = (double)InputOne + (double)InputTwo;
		return output;
	}
	
	static double add(double[] Input)
	{
		double output = 0;
		
		for(int counter = 0; counter < Input.length; counter++)
		{
			Input[0] += Input[counter + 1];
		}
		
		return output;
	}
	
	static double sub(double InputOne, double InputTwo)
	{
		double output = 0;
		output = (double)InputOne - (double)InputTwo;
		return output;
		
	}
	
	static double sub(double InputOne, double InputTwo, double InputThree)
	{
		double output = 0;
		output = (double)InputOne - (double)InputTwo - (double)InputThree;
		
		return output;
	}
	
	static double sub(double[] Input)
	{
		double output = 0;
		
		for(int counter = 0; counter < Input.length; counter++)
		{
			Input[0] -= Input[counter + 1];
		}
		
		return output;
	}
	
	static double multiply(double InputOne, double InputTwo)
	{
		double output = 0;
		output = InputOne * InputTwo;
		return output;
	}
	
	static double multiply(double InputOne, double InputTwo, double InputThree)
	{
		double output = 0;
		output = InputOne * InputTwo * InputThree;
		return output;
	}
	
	static double multiply(double[] Input)
	{
		double output = 0;
		
		for(int counter = 0; counter < Input.length; counter++)
		{
			Input[0] *= Input[counter + 1];
		}
		
		return output;
	}
	
	static double divide(double InputOne, double InputTwo)
	{
		double output = 0;
		output = InputOne / InputTwo;
		return output;
	}
	
	static double divide(double InputOne, double InputTwo, double InputThree)
	{
		double output = 0;
		output = InputOne / InputTwo;
		output /= InputThree;
		return output;
	}

}
