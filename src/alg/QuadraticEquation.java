package alg;



public class QuadraticEquation {

	static String QuadFormula(double A, double B, double C){
		double outputOne = 0;
		double outputTwo = 0;
		double holder;
		String outputString = "";
		
		holder = Math.pow(B, 2) - 4 * A * C;
		outputOne = (-1*B+Math.pow(holder, 0.5)) / 2;
		outputTwo = (-1*B-Math.pow(holder, 0.5)) / 2;
		if(holder >= 0)
		{
		outputString = String.valueOf(outputOne) + "," + String.valueOf(outputTwo) + "\n";
		}
		else
		{
			outputString = String.valueOf(outputOne) + "i, " + String.valueOf(outputTwo) + "i\n";	
		}
		return outputString;
		
	}
	
	static double QuadSolver(double QuadTerm, double LinTerm, double Const, double xVal)
	{
		double output = 0;
		output = QuadTerm * Math.pow(xVal, 2) + LinTerm * xVal + Const;
		return output;
		
	}
	
	
}