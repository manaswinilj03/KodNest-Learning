package controlconstructs;
import java.util.Scanner;
public class Construct 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = scan.nextInt();
		System.out.println("Welcome to Kodnest");
		checkmarks(marks);
	}
	
	public static void checkmarks(int marks) 
	{
		if(marks>=80) 
		{
			System.out.println("Welcome to Tech Club");
		}
		else
		{
			System.out.println("Welcome to Eco Club");
		}
		}
	}


