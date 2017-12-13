package my.programs;

public class Pallindrome {

	public static void main(String[] args) {
		
		int num		= 455;
		int a;
		int rev		= 0;
		int temp	= num;
		
		while(temp>0)
		{
			a	= temp%10;
			temp= temp/10;
			rev	= rev*10+a;
		}
		if(rev==num)
		{
			System.out.println("The number is pallindrome");
		}
		else
		{
			System.out.println("The number is not pallindrome");
		}

	}

}
