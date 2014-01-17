package alg;

public class LinearEquation {

	String getSlope(double[] xValues, double[] yValues)
	{
		double Output = 0;
		int numberOfXValues = xValues.length;
		int numberOfYValues = yValues.length;
		String OutputString = null;
		
		if(numberOfYValues != numberOfXValues)
		{
			OutputString = "Must have Same number of X and Y Values";
		}
		else
		{
			for(int i = 0; i <= 2;)
			{
				Output = (xValues[1] - xValues[0]) / (yValues[1] - yValues[2]);
				OutputString = String.valueOf(Output);
				
			}
		}
		return OutputString;
		
	}

	double getYValueFromSlopeIntercept(double slope, double yIntercept, double xValue)
	{
		double output = 0;
		
		output = slope * xValue + yIntercept;
		
		return output;
	}
	
	double getYValueFromPointSlope(double yValueOfPoint, double xValueOfPoint, double xValueToCalculate, double slope)
	{
		double output = 0;
		
		//y-y1 = m(x-x1)
		
		output = slope * (xValueToCalculate - xValueOfPoint) + yValueOfPoint;
		
		return output;
	}
}
