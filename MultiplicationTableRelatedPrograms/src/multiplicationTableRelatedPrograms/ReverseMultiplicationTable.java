package multiplicationTableRelatedPrograms;
import java.util.Scanner;
public class ReverseMultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a table number which you want to print tables for");
		int n=scan.nextInt();
		Table(n);
	}
	public static void Table(int n) 
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}