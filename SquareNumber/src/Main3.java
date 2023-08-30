import java.util.Scanner;

public class Main3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		printDigit(num);
		
	}
	public static void printDigit(int num) 
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		
		
	}

}
