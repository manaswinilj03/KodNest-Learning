package print_following_pattern;

public class PrintPattern1 
{
 public static void main(String[] args) 
 {
  int n=7;
  for(int i=1;i<=n;i++)
  {
	  for(int j=i;j>0;j--)
	  {
		  System.out.print("*");
	  }
	  System.out.println();
		 
  }
	
}
}