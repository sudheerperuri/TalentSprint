package my.programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int s = 1;
		
		for(int i=1;i<=n;i++)
		{
			s = s * i;
			
		}
		System.out.println("Factorial of "+n+" is ="+s);

	}

}
