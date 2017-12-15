package my.programs;

public class ReverseOfNum {

	public static void main(String[] args) {
		
		int number = 5456;
		int digit;
		int reverse = 0;
		
		while(number > 0)
		{
			digit = number % 10;
			number = number / 10;
			reverse = reverse * 10 + digit;
		}
		
		System.out.println("Reverse of a number is = "+reverse);

	}

}
