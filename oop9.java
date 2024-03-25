

class Vehicle{  
  //defining a method  
  void run(){System.out.println("Vehicle is running");}  
}  
public class method_overriding extends Vehicle{
//Creating a child class  
 
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");}  
  
  public static void main(String args[]){  
  method_overriding obj = new method_overriding();//creating object  
  obj.run();//calling method  
  }  
}  
