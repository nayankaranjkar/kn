import java.util.Scanner;
 
public class palindrome22
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number :"); 
    	int inputnumber = sc.nextInt();
        int num=inputnumber;


        int rem,rev;
        rev=num%10;
    	num=num/10;
        while(num>0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }

        if(rev==inputnumber)
        {
        	System.out.printf("it is palindrome");
        }
        else
        {
        	System.out.printf("not a palindrome");
        }
    }
}
