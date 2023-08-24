package objectcreation;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		Student s2=new Student();
		
		s1.eat();
		s2.eat();
		s1.id=30;
		s2.name="Manu";
		System.out.println("s1.id");
	}	
		
}
