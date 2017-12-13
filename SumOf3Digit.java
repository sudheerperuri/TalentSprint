package my.programs;

public class SumOf3Digit {

	public static void main(String[] args) {
		int num = 798;
		int dig1 = num%10;
		int dig3 = num/100;
		 num = num/10;
		int dig2 = num%10;
		int sum = dig1+dig2+dig3;
		System.out.println("Sum of 3 digit is "+sum);

	}

}
