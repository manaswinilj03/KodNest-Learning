package factorialprograms_using_loops;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		Factorial(n);
	 
	}
	public static void Factorial(int n) 
	{
		//int fact=1;
		//for(int i=1;i<=n;i++)
		//{
		 //fact=fact*i;
		//}
		//System.out.println(fact);
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}