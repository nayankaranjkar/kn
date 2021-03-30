import java.util.Scanner;

public class square4
{

	public static void main(String[] args) 
	{
		
		int number;
		double square;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		number = sc.nextInt();

		square=Math.pow(number, 2);

		System.out.println("square of "+number+" is: "+square);


	}
}