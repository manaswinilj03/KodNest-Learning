package objectcreation2;

public class Fan 
{
  int no_of_Wings;
  String color;
  int cost;
  String brand;
  
  void rotate()
  {
	  System.out.println(color+" color "+brand+" brand "+no_of_Wings+"Winged fan which costs "+cost+" is rotating");
  }
  void blow_Air()
  {
	  System.out.println(color+" Color Fan is blowing Air");
  }
}
