package my.programs;

public class OddPalindrome {

	public static void main(String[] args) 
	{
		int num = 1771, rev;
		
		if(checkAllDigitsOdd(num))
		{
			rev = reverse(num);
			
			if(checkPalindrome(num,rev))
			{
				System.out.println(num+" is a Odd Palindrome");
			}
			else
			{
				System.out.println(num+" is not a Odd Palindrome");
			}
			
		}
		else
		{
			System.out.println(num+" is not a Odd Palindrome");
		}

	}
	
	public static boolean checkAllDigitsOdd(int num)
	{
		int digit;
		int count = 0;
		
		while(num > 0)
		{
			digit = num % 10;
			num = num / 10;
			if(digit % 2 == 0)
			{
				count++;
			}
		}
		if(count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int reverse(int num)
	{
		int rev = 0;
		
		while(num > 0)
		{
			int digit = num % 10;
			num = num / 10;
			rev = rev * 10 + digit;
		}
		return rev;
		
	}
	
	public static boolean checkPalindrome(int num,int rev)
	{
		if(num == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
