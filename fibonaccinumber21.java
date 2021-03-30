import java.util.Scanner;
 
public class fibonaccinumber21
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the number :");
         
        int number = sc.nextInt();
         
        int firstTerm = 0;
        int secondTerm = 1;
        int thirdTerm = 0;

        while (thirdTerm < number)
        {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
         
        if(thirdTerm == number)
        {
            System.out.println("Number belongs to Fibonacci series");
        }
        else
        {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }
    }   
}