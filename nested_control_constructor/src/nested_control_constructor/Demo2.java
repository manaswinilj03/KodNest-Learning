package nested_control_constructor;

public class Demo2 
{
public static void main(String[] args) {
int age = 1;
boolean isCitizen = true;
	        
if (age >= 18) 
{
System.out.println("You are eligible to vote!");
} 
else 
if(isCitizen) 
{
{
System.out.println("You are eligible to vote due to citizenship.");
}
} 
else 
{
 System.out.println("You are not eligible to vote due to age.");
}
}
}

