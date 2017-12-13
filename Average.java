package my.programs;
import java.util.Scanner;

public class Average {
	

private static Scanner s1;

public static void main(String[] args)
{
	int a,b,c;
	s1 = new Scanner(System.in);
	System.out.print("Enter a,b,c=");
	a=s1.nextInt();
	b=s1.nextInt();
	c=s1.nextInt();
	int avg=(a+b+c)/3;
	System.out.print("Average = "+avg);
}

}
