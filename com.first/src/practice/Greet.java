/*package practice;

import java.util.Scanner;
class Greet
{
	public static void main(String []args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the name");
	 String a=scan.next();
	 System.out.println("Enter your birth year");
	 int year=scan.nextInt();
	 greeting(a);
	 ages(year);
	 int result=ages(year);
	 }
	
	public static void greeting (String a)
	{	
     System.out.println("Hello "+ a);
    }
	
	public static int ages(int year)
	{
	 int x=2023;
	 int age=2023-year;
	 System.out.println("You are "+age+" years old");
	 return age;
	}
	
}*/

public class Greet
{
  int id;
  String name;
  
  void eat()
  {
	  System.out.println("Non Stop");
  }
}
class Greets
{
	public static void main(String[] args) {
		Greet s1=new Greet();
		Greet s2=new Greet();
		
		s1.eat();
		s2.eat();
		s1.id=30;
		s2.name="Manu";
		
	}
}

