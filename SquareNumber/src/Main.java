//Number is raised by 2
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		squareNumber(n);
		
	}
	
	public static void squareNumber(int n) 
	{
		int res=n*n;
		System.out.println(res);

		
	}
		
	

}