import java.util.Scanner;

public class Main2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int n=scan.nextInt();
		//printDigit(num,n);
		Counting(num);
		
	}
	public static void printDigit(int num,int n) 
	{
		int result=1;
		for(int i=1;i<=n;i++)
		{
		result=result*num;
		}
		System.out.println(""+result);
		
	}
	public static void Counting(int num)
	{  
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println(""+count);
		
	}

}
