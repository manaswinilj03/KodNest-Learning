package programs;
import java.util.Scanner;
public class Program 
{
	public static void main(String[] args) 
	{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the number which you want to find fibonacci series for");
	 int N = scan.nextInt();
	 Fibonacci(N);
	}
	
	public static void Fibonacci(int N)
	   {
	    int num1 = 0;
	    int num2 = 1;
	    int counter = 0;
	    while(counter < N)
	     {
	      System.out.println(num1 +" ");
	      int num3 = num2 + num1;
	      num1 = num2;
	      num2 = num3;
	      counter = counter++;
	     }
	   }
		

}

