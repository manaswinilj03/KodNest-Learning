package sumrelatedprograms;
import java.util.Scanner;
public class EvenNumbersSum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();  
		for(int i=1;i<n;i++) 
		{
		sum=sum+(2*i);
	    }
		System.out.println(sum);
		
	}
}


