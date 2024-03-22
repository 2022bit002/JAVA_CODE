 interface printable{  
	 void print();  
	  default void dMethod(){
	  	System.out.println("inside the default method inside interface"+this);
	  }
	  static void staticBlock(){
	  	System.out.println("inside the static method inside interface");
	  }
	  int numm=457;
	}
	
class master implements printable{
	public void print(){
		System.out.println("i am printing " +numm);
	}
	public static void main(String args[]){  
 	master m = new master();
 	m.print();
 	m.dMethod();
 	printable.staticBlock();
}  
}
