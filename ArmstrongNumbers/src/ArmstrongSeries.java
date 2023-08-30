import java.util.Scanner;

public class ArmstrongSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		System.out.println("isArmstrong number: "+checkArmstrong(num));
		
	}
	
	public static boolean checkArmstrong(int num) 
	{
		int digits=0,temp;
		int sum=0;
		temp=num;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		System.out.println("Number of digits:"+digits);
		temp=num;
		while(temp>0)
		{
			int lastdigit = temp%10;
			sum = (int)(sum+Math.pow(lastdigit, digits));
			temp = temp/10;
		}
		if(sum==num)
			return true;
		else
			return false;
	}
		
}
		

	
	
	
		