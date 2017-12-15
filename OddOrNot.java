package my.programs;

public class OddOrNot {

	public static void main(String[] args) {
		
		int num = 2000;
		int dig;
		
		while(num > 0)
		{
			dig = num % 10;
			num = num / 10;
			int c = dig%2;
			
			if(c == 1)
			{
				System.out.println(dig+" is odd");
			}
			else
			{
				System.out.println(dig+" is not odd");
			}
			
		}
		

	}

}
