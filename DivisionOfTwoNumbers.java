package my.programs;

public class DivisionOfTwoNumbers
{
	public static void main(String[] args)
	{
		double num1	=	2589244;
		double num2	=	25;
		double div;
		
		if(num2	==	0)
		{
			System.out.println("Division is not possible denominator is 0");
		}
		
		else
		{
			div	= num1/num2;
			System.out.println("Division is possible = "+div);
		}
		
		
	}

}
