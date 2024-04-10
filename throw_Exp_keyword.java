class throw_Keyword{
	public static void main(String ...args) throws InterruptedException {
		try{
		System.out.println(args[0]);
		Thread.sleep(1000);
		
	
		}
		catch(ArrayIndexOutOfBoundsException a ){
			System.out.println("array out of bound index");
		}
		finally{
			System.out.println(" here the throws keyword is use to throw the exception that is expected to be occur and handle that error");
		}
		
		}
}
