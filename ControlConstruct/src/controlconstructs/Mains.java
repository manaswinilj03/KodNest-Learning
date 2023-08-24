package controlconstructs;
import java.util.Scanner;
public class Mains
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		printEvenNumbers(n);
		
	}
	
	public static void printEvenNumbers(int n) 
	{
		for(int i=2;i<=n;i=i+2)
		{
			System.out.print(i + " ");
		}
	}
}