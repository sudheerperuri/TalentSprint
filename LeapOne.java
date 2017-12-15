package my.programs;

public class LeapOne {

	public static void main(String[] args) {
		
		int y = 2000;
		
		if((y % 4 == 0)||(y % 400 == 0)&&(y % 100 != 0))
		{
			System.out.println(y+" It is a leap year");
		}
		else
		{
			System.out.println(y+" not a leap year");
		}

	}

}
