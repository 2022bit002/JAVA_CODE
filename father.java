	class Father{
		int balance =35678;                  //instance variable
		static String name = "patil";  //static keyword is use to allocate the memory just once
		                                                     //this variable is also called as class variable (global)
		static int income = 98637;
			public static void main(String[] args){
				
				
				Father son = new Father()  ;      //new keyword is use to give new memory..
				System.out.println(son.balance);
				System.out.println(son.name);
				System.out.println(name);    //this will also give output as name is an class variable(global)
				
				
				Father daughter = new Father();
			        System.out.println(daughter.name); //this display same name as before 
				daughter.balance = 99999;
				daughter.name = "pawar";   //here the name is modified and it will now the default name
				System.out.println(daughter.name);
				System.out.println(name);  //here the outcome will now pawar it is also because the memory is allocated just once
				//   System.out.println(balance);    // error: non-static variable balance cannot be referenced from a static context
				
				//String y = getName(son);  //here getName is an non-static hence it can not be refered in such a way 
				
				String y = son.getName(son);  //  hence we used object son to call getName function
				String x = daughter.getName(daughter);
				System.out.println(y);
				daughter.name = "mane";    //name modified again
				System.out.println(x);
				System.out.println(name); 
 
				

			}
			
			public String getName(Father f ){
	   		//return f.name ;(required the name hence we return name)
	   		return f.income;
			
			
			}
		



}
