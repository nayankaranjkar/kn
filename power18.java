import java.util.Scanner;


public class power18
{  
	public static void main(String args[])   
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		int num = sc.nextInt();

		System.out.println("enter the power\n");
		int pow = sc.nextInt();

		int power=1,i;
		for(i=1;i<=pow;i++)
		{
			power=power*num;
		}
		System.out.printf("the power of %d raised to %d is: %d",num,pow,power);
	}
}