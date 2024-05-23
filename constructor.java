class constructor{
	int age ;
	String name;
	
	constructor(){
		this(21,"pankaj"); 
		System.out.println("this is an default constructor by me ");
	//	
	}
	
	constructor(int a, String b){
		
		System.out.println("name is "+b+" and age is "+a);
		
	}
	
	public static void main(String ...args){
		constructor c = new constructor();
		
	}
	
	}
