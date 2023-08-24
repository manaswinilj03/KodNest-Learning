package controlconstructs;
import java.util.Scanner;
public class Main2 
{
	public static void main(String[] args) 
	{
	  Scanner scan = new Scanner(System.in);
	  int n=scan.nextInt();
	  calculateSum(n);
	}
	
	public static void calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		
			System.out.print(sum);
		}
	}


