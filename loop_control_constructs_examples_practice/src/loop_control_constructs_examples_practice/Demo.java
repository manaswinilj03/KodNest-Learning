package loop_control_constructs_examples_practice;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Starts");
		int i=1;
		manu:while(i<=5)
		{
		 int j=1;
		 anu:while(j<=10)
		 {
			 System.out.print("Manu & Anu");
			 j++;
			 break ;
		 }
		 System.out.println();
		 i++;
		}
	}
}

	
		



