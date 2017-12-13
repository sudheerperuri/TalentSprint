package my.programs;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		int num1 = 45;
		int num2 = 88;
		System.out.println("Before swapping num1 and num2 = "+num1+","+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(" After swapping num1 and num2 = "+num1+","+num2);

	}

}
