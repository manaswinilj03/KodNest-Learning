//Number raised by n

import java.util.Scanner;

public class Main1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers");
		double num = scan.nextDouble();
		double n   = scan.nextDouble();
		Power(num,n);
	}
	public static void Power(double num,double n) 
	{   
		double result=1;
		for(int i=1;i<=n;i++)
		{
		result=result*num;
		}
		System.out.println(result);
	}
}
