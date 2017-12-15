package my.programs;

public class GreatestOf3 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 54;
		int num3 = 45;
		
		if(num1 > num2)
		{
			if(num1 > num3)
			{
				System.out.println(num1+" is greatest");
			}
			else
			{
				System.out.println(num3+"is greatest");
			}
		}
		else if(num2 > num3)
		{
			System.out.println(num2+" is greatest");
		}
		else
		{
			System.out.println(num3+" is greatest");
		}

	}

}
