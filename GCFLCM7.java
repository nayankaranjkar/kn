import java.util.Scanner;

public class GCFLCM7 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number");
		int n1= sc.nextInt();

		System.out.println("enter second number");
		int n2= sc.nextInt();

		int lcm= LCM(n1, n2);
		int gcf= GCF(n1,n2);

		System.out.printf("The GCF of %d and %d is %d.\n", n1, n2, gcf);
		System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	} 
	
	public static int GCF(int n1, int n2) 
	{
    if (n2 == 0) 
    {
    	return n1;
    } 
    else 
    {
    	return (GCF(n2, n1 % n2));
    }
	}
    public static int LCM(int n1, int n2) 
    {
   		int lcm = (n1 > n2) ? n1 : n2;

   		while(true) 
   		{
    		if( lcm % n1 == 0 && lcm % n2 == 0 ) 
    		{
        		return lcm;
        	}
      		++lcm;
    	}
  	}

		
}
