class c2{
	static int a=567;
	static int b =34875;	
	public static void main(String args[]){
		int c ;
		int d=0;
		
		// ARITHMATIC OPERATOR
		System.out.println(a+b);
		System.out.println(a-b);
		
		// ASSIGNMENT OPERATOR 
		c=578;
		c=d;
		
		// RELATIONAL OPERATOR
		if(c==d){
			boolean r=true;
	
		System.out.println("c,d are equal in number :"+r);
		}
		//LOGICAL OPERATOR
		if(a>c){
		System.out.println("a is greater than c");
		}
		
		//BITWISE OPERATOR
		
		if(a>c || b>a){
			System.out.println("b can be the greatest number");
		}
		if(a>c && b>a){
			System.out.println("b is the greatest number");
		}
		
		//  SHIFT OPERATOR
		
	        int h =872<<a;
	        int q = 837456>>b;
	  	System.out.println("h :"+h+"  q  "+q);
		
}
}
