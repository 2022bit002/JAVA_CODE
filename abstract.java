abstract class Bike{  
  	abstract void run();  
  	void print(){
  		System.out.println("printnig the block "+this);
  	} 
  	int num=90;
  	static void stop(){
  	System.out.println("stop running the bike");
  	}
  	Bike(){
  		System.out.println("constructor of bike"+this);
  		
  	}
}  
class Honda4 extends Bike{  

	int num=342;

	void run(){
		System.out.println("running safely "+this.num);
	}  
	public static void main(String args[]){  
 	Bike obj = new Honda4();  
 	obj.run();  
 	obj.stop();
 	stop();
 	obj.print();
}  
}  
