package nested_control_constructor;
import java.util.Scanner;
public class Demo1 
{
public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the marks");
int marks = scan.nextInt();
int attendancePercentage = scan.nextInt();
	        
if (marks >= 50) 
{
if (attendancePercentage >= 75) 
{
System.out.println("Congratulations! You have passed the exam.");
} 
else 
{
System.out.println("Sorry, you failed due to low attendance.");
}
} else 
{
System.out.println("Sorry, you failed due to low marks.");
}
}
}



