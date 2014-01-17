package trig;


import java.util.Scanner;

public class Functions 
{

	double PythagTheorem(double A, double B, double C)
	{
		double D = 0;
		
		Scanner errorHandler = new Scanner(System.in);
		String solveForString = new String();
		
		
		System.out.println("Please specify variable to solve for:\n");
		if(errorHandler.hasNext()){
		solveForString = errorHandler.toString();
		char[] solveForChar;
		solveForChar = solveForString.toCharArray();
		
		
		if(C == solveForChar[0])
		{
			C = Math.pow(A, 2) + Math.pow(B, 2);
			D = Math.pow(C, 0.5);
			
		}
		else if(A == solveForChar[0])
		{
			A = Math.pow(C, 2) - Math.pow(B, 2);
			D = Math.pow(A, 0.5);
			
		}
		else if(B == solveForChar[0])
		{
			B = Math.pow(C, 2) - Math.pow(A, 2);
			D = Math.pow(B, 0.5);
			
		}
		
		}
		
		errorHandler.close();
		return D;
	}

	
	double getTangent(double Opp, double Adj, double Output)
	{
		Output = 0;
		Output = Opp / Adj;
		
		return Output;
		
	}
	
	double getSin(double Opp, double hypo, double Output)
	{
		Output = 0;
		Output = Opp / hypo;
		
		return Output;
	}
	
	
	double getCos(double adj, double hypo, double Output)
	{
		Output = 0;
		Output = adj / hypo;
		
		return Output;
	}

	double getACos(double adj, double hypo, double Output)
	{
		Output = 0;
		Output = hypo / adj;
		
		return Output;
	}

	double getASin(double opp, double hypo, double Output)
	{
		Output = 0;
		Output = hypo / opp;
		
		return Output;
	}

	double getATangent(double opp, double adj, double output)
	{
		output = 0;
		output = adj / opp;
		
		return output;
	}
	
	

}

