package my.programs;

public class SplitDigits {

	public static void main(String[] args) {
		
		int num = 4568;
		int d;
		System.out.print("Digits are = ");
		
		while(num > 0)
		{
			d = num % 10;
			num = num/10;
			System.out.print(d+" ");
		}
	}

}
