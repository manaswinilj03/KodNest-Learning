package methods;

public class Methods 
//Type 4 method--> Accept parameter and give return value
{
 public static void main(String []args)
 {
	int x=500;
	int y=600;
	add(x,y);
	int res=add(x,y);
	System.out.println("Addition result is="+res);
	float c=645.262F;
	double d=5656.44;
	mul(c,d);
	double result=mul(x,y);
	System.out.println("Multiplication result is="+result);
 }
 public static int add(int a,int b)
 {
	 int c=a+b;
	 return c;
 }
 
 public static double mul(float m,double n)
 {
	 double e=m*n;
	 return e;
 }
}
