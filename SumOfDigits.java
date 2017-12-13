package my.programs;

public class SumOfDigits {
	public static void main(String[] args){
		int num = 56;
		int dig1 = num/10;
		int dig2 = num%10;
		int sum = dig1+dig2;
		int sub = dig1-dig2;
		System.out.println("Sum of digits "+num+" is = "+sum+"\n"+"Difference of digits "+num+" is = "+sub);
	}

}
