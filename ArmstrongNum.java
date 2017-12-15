package my.programs;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int num = 153;
		int i;
		int a = 0;
		int temp = num;
		
		while(temp > 0)
		{
			i = temp % 10;
			temp = temp / 10;
			a = a + (i*i*i);
		}
		
		if(a == num)
		{
			
			System.out.println(num+" is an Armstrong number");
		
		}
		
		else
		{
			System.out.println(num+" is not an Armstrong number");
		}

	}

}
