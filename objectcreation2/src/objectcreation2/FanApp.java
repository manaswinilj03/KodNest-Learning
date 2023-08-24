package objectcreation2;

public class FanApp 
{
  public static void main(String[] args) 
  {
   Fan f1=new Fan();
   f1.no_of_Wings=4;
   f1.color="Cream";
   f1.cost=3000;
   f1.brand="Crompton";
   f1.rotate();
   f1.blow_Air();
   System.out.println(f1.no_of_Wings+" "+f1.color+" " +f1.cost+ " "+f1.brand);
   
   System.out.println("=============================================================");
   Fan f2=new Fan();
   f2.no_of_Wings=3;
   f2.color="Crimsonred";
   f2.cost=3100;
   f2.brand="Crompton X series";
   f2.rotate();
   f2.blow_Air();
   System.out.println(f2.no_of_Wings+" "+f2.color+" " +f2.cost+ " "+f2.brand);
   
   System.out.println("=============================================================");
   Fan f3=new Fan();
   f3.no_of_Wings=5;
   f3.color="Black";
   f3.cost=3200;
   f3.brand="Crompton Y series";
   f3.rotate();
   f3.blow_Air();
   System.out.println(f3.no_of_Wings+" "+f3.color+" " +f3.cost+ " "+f3.brand);
  }
} 
   

   
   
  
