package controlconstructs;
import java.util.Scanner;
public class Fibonacci 
{
  public static void main(String[] args) 
  {

	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	printFibonacci(n);
  }
  
  public static void printFibonacci(int n) 
  {   
	  int n1= 0;
	  int n2 = 1;
	  for(int i=1;i<=n;++i)
	  {
		  System.out.print(n1+" ");
		  int nextTerm=n1+n2;
		  n1=n2;
		  n2=nextTerm;
	  }
  }
}