package my.programs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int s1=0;
		int s2=1;
		int s3;
		System.out.print(s1+" , "+s2+" , ");
		
		for(int i = 1;i<=n;i++)
		{
			s3= s1 + s2;
			System.out.print(s3+" , ");
			s1 = s2;
			s2 = s3;
			
		}
		
	}

}
