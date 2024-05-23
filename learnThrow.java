class Learn_Throw{
	public static void main(String args[]){
	
	try{
		Thread.sleep(1000) ;//throw new learnThrow("this is an exception");
		
		System.out.println("Hey we are learning to handle the throws !!!");
	}
	
	catch(Exception e){
		System.out.println("this exception is caught"); 
	}
	}
}
