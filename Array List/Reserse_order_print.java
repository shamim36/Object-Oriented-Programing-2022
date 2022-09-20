import java.util.*;

public class Reserse_order_print{
  
    public static void main ( String[] args){
      
    ArrayList<String>cars = new ArrayList<String>();
      
    cars.add("VOLVO");
    cars.add("BMN");
    cars.add("Ford");
      
    for (int i =cars.size()-1; i>=0; i--)
   
      {
          System.out.println (cars.get (i));
      }
}
    
}
