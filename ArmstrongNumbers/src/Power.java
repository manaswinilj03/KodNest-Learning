import java.util.Scanner;

public class Power 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a base number and a number it has to raise for");
		double base = scan.nextDouble();
		double exponent = scan.nextDouble();
		Power(base,exponent);
	
	}
	
	public static void Power(double base,double exponent) 
	{
	  double res=Math.pow(base, exponent);
	  System.out.println(res);
	}


}
